package com.simplon.voyageaplusieurs.Service;


import com.simplon.voyageaplusieurs.Model.Reservation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservationService {

    /**
     * Get the complete list of Destinations
     * @return the complete list from persistence layer.
     */
    List<Reservation> getReservations();

    Reservation createReservation(Reservation reservationToCreate);

  //  void createReservation(Reservation reservation);

    /**
     * Update the reservation toUpdate
     * @param id
     * @param reservationToUpdate
     * @return the updated reservation
     */
    ResponseEntity<Reservation> updateReservation(Long id, Reservation reservationToUpdate);


    /**
     * Get the list of Destinations filtered on country and duration
     * @return the  list filtered from persistence layer.

    List<Destination> getDestinationsSelect(String country);
    */
/*
    List<Reservation> FilteredReservation(String id);

    */
}
