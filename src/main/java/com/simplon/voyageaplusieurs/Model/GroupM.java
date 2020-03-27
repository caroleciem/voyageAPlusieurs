package com.simplon.voyageaplusieurs.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @JsonIgnore
    @OneToMany(mappedBy="groupM")
    private List<Reservation> reservations = new ArrayList<>();

    @JsonIgnore
    @ManyToMany(mappedBy = "groupList")
    private Set<Person> personSet = new HashSet();

    public Long getId() {
        return id;
    }


    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(Set<Person> personSet) {
        this.personSet = personSet;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    @Override
    public String toString() {
            String res;
            res = "GroupM{" +
                    "id=" + id +
                    ", personSet=";

            for (Person s : personSet) {
                System.out.println(s);
                res += s + " ";
            }

            res+=", reservationSet=";

            for (Reservation r : reservations) {
                System.out.println(r);
                res += r + " ";
            }
            return res;

        }


}
