package com.simplon.voyageaplusieurs.Model;


import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Group {
    @Id
    @SequenceGenerator(name = "group_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "group_seq_id")
    private Long id;


    public Long getId() {
        return id;
    }


    @OneToMany(mappedBy = "group")
    private List<Reservation> reservations = new ArrayList<>();


}
