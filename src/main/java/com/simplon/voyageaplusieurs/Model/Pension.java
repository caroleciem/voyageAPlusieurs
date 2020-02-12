package com.simplon.voyageaplusieurs.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pension {
    @Id
    @SequenceGenerator(name="pension_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pension_seq_id")
    private Long id;
    private PensionType pensionType;
    @ManyToMany(mappedBy = "pensions")
    private Set<Trip> pensions = new HashSet<>();
}
