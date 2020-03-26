package com.simplon.voyageaplusieurs.Model;

import javax.persistence.*;
import java.util.*;


@Entity
public class Reservation {
    @Id
    

    @SequenceGenerator(name = "reservation_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reservation_seq_id")
    
    private Long id;
    private Long bedRoomNumber;
    private Double globalPrice;
    @Temporal(TemporalType.DATE)
    private Date date;
   private PensionType pensionType;

     @OneToMany(mappedBy = "reservation")
    Set<Payment> paymentSet = new HashSet<>();
   
    @OneToOne
    private Trip trip;

    @ManyToOne
    private GroupM groupM;



    public Long getId() {
        return id;
    }

    public Long getBedRoomNumber() {
        return bedRoomNumber;
    }

    public Double getGlobalPrice() {
        return globalPrice;
    }

    public Date getDate() {
        return date;
    }

    public PensionType getPensionType() {
        return pensionType;
    }

    public Set<Payment> getPaymentSet() {
        return paymentSet;
    }
  /*
*/
    public void setId(Long id) {
        this.id = id;
    }

    public void setBedRoomNumber(Long bedRoomNumber) {
        this.bedRoomNumber = bedRoomNumber;
    }

    public void setGlobalPrice(Double globalPrice) {
        this.globalPrice = globalPrice;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPensionType(PensionType pensionType) {
        this.pensionType = pensionType;
    }

    public void setPaymentSet(Set<Payment> paymentSet) {
        this.paymentSet = paymentSet;
    }
  
    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public void setGroupM(GroupM groupM) {
        this.groupM = groupM;
    }

    @Override
    public String toString() {
        String res;
        res = "Reservation{" +
                "id=" + id +
                ", globalPrice=" + globalPrice + '\'' +
                ", Bedroomnumber='" + bedRoomNumber + '\'' +
                ", Date='" + date + '\'' +
                ", PensionType='" + pensionType + "}";

         return res;
    }
}
