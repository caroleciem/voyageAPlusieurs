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
    private String country;
    private String descriptive;
    private String situation;
    @OneToMany(mappedBy="destination")
    private List<Trip> trips = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDescriptive() {
        return descriptive;
    }

    public void setDescriptive(String descriptive) {
        this.descriptive = descriptive;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public List<Trip> getTrips() {
        return trips;
    }

    public void setTrips(List<Trip> trips) {
        this.trips = trips;
    }
}
