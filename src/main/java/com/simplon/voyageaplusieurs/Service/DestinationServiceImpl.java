package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Destination;
import com.simplon.voyageaplusieurs.Repository.DestinationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DestinationServiceImpl implements DestinationService {

    private DestinationRepository destinationRepository;


    //constructor
    public DestinationServiceImpl(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;

    }

    @Override
    public List<Destination> getDestinations() {
        return destinationRepository.findAll();

    }
}
