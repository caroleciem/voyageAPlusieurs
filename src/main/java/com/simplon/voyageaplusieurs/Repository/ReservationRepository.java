package com.simplon.voyageaplusieurs.Repository;

import com.simplon.voyageaplusieurs.Model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    
}
