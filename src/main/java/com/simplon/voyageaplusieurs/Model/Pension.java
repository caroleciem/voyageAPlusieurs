package com.simplon.voyageaplusieurs.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Pension {
    @Id
    @SequenceGenerator(name="pension_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pension_seq_id")
    private Long id;
    @Enumerated(EnumType.STRING)
    private PensionType pensionType;
    @ManyToMany(mappedBy = "pensions")
    private Set<Trip> pensions = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PensionType getPensionType() {
        return pensionType;
    }

    public void setPensionType(PensionType pensionType) {
        this.pensionType = pensionType;
    }

    public Set<Trip> getPensions() {
        return pensions;
    }

    public void setPensions(Set<Trip> pensions) {
        this.pensions = pensions;
    }
}
