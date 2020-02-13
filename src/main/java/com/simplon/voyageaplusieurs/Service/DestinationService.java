package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Destination;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DestinationService {

    /**
     * Get the complete list of Destinations
     * @return the complete list from persistence layer.
     */
    List<Destination> getDestinations();
}
