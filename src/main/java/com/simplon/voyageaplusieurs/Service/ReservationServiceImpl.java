package com.simplon.voyageaplusieurs.Service;


import com.simplon.voyageaplusieurs.Model.Reservation;
import com.simplon.voyageaplusieurs.Repository.ReservationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    private ReservationRepository reservationRepository;


    //constructor
    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation createReservation(Reservation reservationToCreate) {
        return reservationRepository.save(reservationToCreate);
    }

    @Override
    public ResponseEntity<Reservation> updateReservation(Long id, Reservation reservationToUpdate) {
        Optional<Reservation> selectedReservation = this.reservationRepository.findById(id);
        if (reservationRepository.existsById(id)&&reservationToUpdate.getId().equals(id)){
            return ResponseEntity.ok(reservationRepository.save(reservationToUpdate));
        }
        return ResponseEntity.notFound().build();
    }
}
