package com.simplon.voyageaplusieurs.Model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class GroupM {
    @Id
    @SequenceGenerator(name="group_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_seq_id")
    private Long id;

    @OneToMany(mappedBy="groupM")
    private List<Reservation> reservations = new ArrayList<>();


}
