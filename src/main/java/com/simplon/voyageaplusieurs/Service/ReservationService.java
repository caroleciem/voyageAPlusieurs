package com.simplon.voyageaplusieurs.Service;


import com.simplon.voyageaplusieurs.Model.Reservation;
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
     * Get the list of Destinations filtered on country and duration
     * @return the  list filtered from persistence layer.

    List<Destination> getDestinationsSelect(String country);
    */
/*
    List<Reservation> FilteredReservation(String id);

    */
}
