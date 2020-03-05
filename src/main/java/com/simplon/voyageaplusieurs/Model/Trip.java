package com.simplon.voyageaplusieurs.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Trip {
    @Id
    @SequenceGenerator(name="trip_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trip_seq_id")
    private Long id;
    private Double pricePerPers;
    private Integer duration;
    private String descriptiveRestauration;
    @JsonIgnore
    @ManyToOne
    private Destination destination;
    @ManyToMany
    @JoinTable(
            name ="trip_pension",
            joinColumns = @JoinColumn(name ="trip_id"),
            inverseJoinColumns= @JoinColumn(name = "pension_id")
    )
    private Set<Pension> pensions = new HashSet<>();

}
