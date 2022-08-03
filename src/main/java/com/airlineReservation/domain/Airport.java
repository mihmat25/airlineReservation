package com.airlineReservation.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @OneToMany (mappedBy = "airport")
    public Set<Flight> flights = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;
}
