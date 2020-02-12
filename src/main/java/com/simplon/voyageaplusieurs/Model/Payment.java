package com.simplon.voyageaplusieurs.Model;
import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @SequenceGenerator(name="payment_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_seq_id")
    private Long id;

    @ManyToOne
    private Reservation reservation;

    @Column(nullable = false)
    private Double amount;
}
