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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPricePerPers() {
        return pricePerPers;
    }

    public void setPricePerPers(Double pricePerPers) {
        this.pricePerPers = pricePerPers;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDescriptiveRestauration() {
        return descriptiveRestauration;
    }

    public void setDescriptiveRestauration(String descriptiveRestauration) {
        this.descriptiveRestauration = descriptiveRestauration;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Set<Pension> getPensions() {
        return pensions;
    }

    public void setPensions(Set<Pension> pensions) {
        this.pensions = pensions;
    }

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
