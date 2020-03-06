package com.simplon.voyageaplusieurs.Model;
import java.util.ArrayList;
import java.util.HashSet;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Person {
    @Id
    @SequenceGenerator(name="person_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_seq_id")
    private Long id;

    @Column(nullable = false)
    private String civility;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
    private String adresse;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private Integer zipCode;

    @Column(nullable = false)
    private String email;

    private String telephone;

    @ManyToMany
    @JoinTable(
            name = "person_role",
            joinColumns = @JoinColumn(name="person_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )
    private Set<Role> roleSet= new HashSet();

    @ManyToMany
    @JoinTable(
            name = "groupm",
            joinColumns = @JoinColumn(name="person_id"),
            inverseJoinColumns = @JoinColumn(name="groupm_id")
    )
    
    private List<GroupM> groupms = new ArrayList<>();


}

