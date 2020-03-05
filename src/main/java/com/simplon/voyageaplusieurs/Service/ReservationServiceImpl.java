package com.simplon.voyageaplusieurs.Service;


import com.simplon.voyageaplusieurs.Model.Reservation;
import com.simplon.voyageaplusieurs.Repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
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


}
