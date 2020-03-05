package com.simplon.voyageaplusieurs.Model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/*
@Entity
public class GroupM {
    @Id
    @SequenceGenerator(name="group_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_seq_id")
    private Long id;

    @OneToMany(mappedBy="groupM")
    private List<Reservation> reservations = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "Person",
            joinColumns = @JoinColumn(name = "groupm_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id")
    )

    private List<Person> persons = new ArrayList<>();





    public Long getId() {
        return id;
    }



    public List<Reservation> getListReservation() {
        return reservations;
    }


    public List<Person> getListPerson() {
        return persons;
    }


}*/
