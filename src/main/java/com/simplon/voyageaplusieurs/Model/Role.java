package com.simplon.voyageaplusieurs.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Role {
    @Id
    @SequenceGenerator(name="role_seq_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq_id")
    private Long id;
    @Enumerated(EnumType.STRING)
    private RoleType roleType;
    @JsonIgnore
    @ManyToMany(mappedBy = "roleSet")
    private Set<Person> personSet = new HashSet();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) &&
                roleType == role.roleType &&
                Objects.equals(personSet, role.personSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roleType);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleType getRoleType() {
        return roleType;
    }


    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Set<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(Set<Person> personSet) {
        this.personSet = personSet;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleType=" + roleType +
                ", personSet=" + personSet +
                '}';
    }
}
