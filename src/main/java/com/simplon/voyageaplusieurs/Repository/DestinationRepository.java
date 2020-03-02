package com.simplon.voyageaplusieurs.Repository;

import com.simplon.voyageaplusieurs.Model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinationRepository  extends JpaRepository<Destination, Long> {
    @Query("SELECT destination FROM Destination destination where destination.country = :country")
    List<Destination> findAllByCountry(String country);


}
