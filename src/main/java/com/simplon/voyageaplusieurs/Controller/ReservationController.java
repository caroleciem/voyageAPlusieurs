package com.simplon.voyageaplusieurs.Controller;




import com.simplon.voyageaplusieurs.Model.Reservation;
import com.simplon.voyageaplusieurs.Repository.ReservationRepository;
import com.simplon.voyageaplusieurs.Service.ReservationService;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/reservation")
@CrossOrigin(origins = "http://localhost:4200")
public class ReservationController {

    private ReservationService reservationService;
    public ReservationController(ReservationService reservationService){
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<Reservation> getReservationList(){
        return (this.reservationService.getReservations());
}

    @PostMapping(value = "/createReservation")
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservationToCreate) {
        Reservation savedReservation = reservationService.createReservation(reservationToCreate);
        return ResponseEntity.ok(savedReservation);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Reservation> updateReservation(@PathVariable Long id,@RequestBody Reservation reservationToUpdate ) {
        ResponseEntity<Reservation> reservationResponse = reservationService.updateReservation(id,reservationToUpdate);
        return reservationResponse;
    }
}
