package com.simplon.voyageaplusieurs.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Destination {
    @Id
    @SequenceGenerator(name="destination_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "destination_seq_id")
    private Long id;
    private String continent;
    private String Country;
    private String descriptive;
    private String situation;
    @OneToMany(mappedBy="destination")
    private List<Trip> trips = new ArrayList<>();
}
