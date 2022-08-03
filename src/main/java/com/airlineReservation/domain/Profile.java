package com.airlineReservation.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private Byte age;

    @Column
    private ProfileType profileType;

    @Column
    @OneToMany(mappedBy = "profile")
    private Set<Flight> flights = new HashSet<>();
}
