package com.simplon.voyageaplusieurs.Model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Reservation {

    @Id
    @SequenceGenerator(name = "reservation_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reservation_seq_id")
    private Long id;

    @Column(nullable = false)
    private Trip trip;

     @ManyToOne

    private Group group;

    @Column(nullable = false)
    private String bedRoomNumber;

    @Column(nullable = false)
    private Double globalPrice;

    @Column(nullable = false)
    private Date date;

    @Column()
    private PensionType pensionType;





    public Long getId() {
        return id;
    }

    public Trip getTrip() {
        return trip;
    }

    public Group getGroup() {
        return group;
    }


    public String getBedRoomNumber() {
        return bedRoomNumber;
    }


    public double getGlobalPrice() {
        return globalPrice;

    }


    public Date getDate() {
        return date;

    }

}
