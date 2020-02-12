package com.simplon.voyageaplusieurs.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {
    @Id
    @SequenceGenerator(name="role_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq_id")
    private Long id;
    private RoleType roleType;

    @ManyToMany(mappedBy = "roleSet")
    private Set<Person> personSet = new HashSet();
}
