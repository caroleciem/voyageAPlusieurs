package com.simplon.voyageaplusieurs.Model;
import java.util.HashSet;

import javax.persistence.*;
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
    private String firstName;

    @Column(nullable = false)
    private String name;

    @Column
    private String address;

    @Column
    private String city;

    @Column
    private String country;

    @Column
    private Integer zipCode;

    @Column
    private String email;

    private String phone;

    @ManyToMany
    @JoinTable(
            name = "person_role",
            joinColumns = @JoinColumn(name="person_id"),
            inverseJoinColumns = @JoinColumn(name="role_id")
    )
    private Set<Role> roleSet= new HashSet();

    @ManyToMany
    @JoinTable(
            name = "person_group",
            joinColumns = @JoinColumn(name="person_id"),
            inverseJoinColumns = @JoinColumn(name="group_id")
    )
    private Set<GroupM> groupList = new HashSet<GroupM>();

    @OneToMany(mappedBy = "person")
    Set<Payment> personPaymentSet = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCivility() {
        return civility;
    }

    public void setCivility(String civility) {
        this.civility = civility;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.name = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAdresse(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setTelephone(String phone) {
        this.phone = phone;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", civility='" + civility + '\'' +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + name + '\'' +
                ", adresse='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zipCode=" + zipCode +
                ", email='" + email + '\'' +
                ", telephone='" + phone + '\'' +
                ", roleSet=" + roleSet +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

