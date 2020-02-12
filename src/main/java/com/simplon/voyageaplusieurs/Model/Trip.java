package com.simplon.voyageaplusieurs.Model;

import javax.persistence.Entity;

@Entity
public class Trip {
    private Long id;
    private Double pricePerPers;
    private Integer duration;
    private String descriptiveRestauration;
    private Destination destination;
    private PensionType pensionType;

}
