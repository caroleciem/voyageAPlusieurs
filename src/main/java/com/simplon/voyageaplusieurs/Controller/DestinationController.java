package com.simplon.voyageaplusieurs.Controller;

import com.simplon.voyageaplusieurs.Model.Destination;
import com.simplon.voyageaplusieurs.Service.DestinationService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DestinationController {
    private DestinationService destinationService;
    public DestinationController(DestinationService destinationService){
        this.destinationService = destinationService;
    }

    @GetMapping
    public List<Destination> getDestinations(){
        return (this.destinationService.getDestinations());

    }
}
