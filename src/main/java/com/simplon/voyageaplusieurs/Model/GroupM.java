package com.simplon.voyageaplusieurs.Model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class GroupM {
    @Id
    @SequenceGenerator(name="group_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_seq_id")
    private Long id;

    @OneToMany(mappedBy="groupM")
    private List<Reservation> reservations = new ArrayList<>();


    @ManyToMany(mappedBy = "groupList")
    private Set<Person> personSet = new HashSet();


    public Long getId() {
        return id;
    }



    public List<Reservation> getListReservation() {
        return reservations;
    }


    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(Set<Person> personSet) {
        this.personSet = personSet;
    }
}
