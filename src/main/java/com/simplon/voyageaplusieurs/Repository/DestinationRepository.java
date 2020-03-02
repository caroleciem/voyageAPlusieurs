package com.simplon.voyageaplusieurs.Repository;

import com.simplon.voyageaplusieurs.Model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DestinationRepository  extends JpaRepository<Destination, Long> {
/*    @Query("SELECT destination FROM Destination  where destination.country = :country")
    List<Destination> findAllByCountry(String country);
    */

}
