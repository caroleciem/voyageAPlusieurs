package com.simplon.voyageaplusieurs.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Reservation {

    @Id
    @SequenceGenerator(name="reservation_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reservation_seq_id")
    private Long id;

    @Column(nullable = false)
    private String bedRoomNumber;

    @Column(nullable = false)
    private Double globalPrice;

    @Column(nullable = false)
    private Date date;

    @Column()
    private PensionType pensionType;

    @OneToMany(mappedBy = "reservation")
    Set<Payment> paymentSet = new HashSet<>();

    @OneToOne
    private Trip trip;

    @ManyToOne
    private GroupM groupM;
}
