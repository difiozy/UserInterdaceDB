package com.example.userinterface.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "flights")
@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flightId", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "airplaneId", nullable = false)
    private Airplane airplane;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "routeId", nullable = false)
    private Route route;

    @Column(name = "departureTime", nullable = false)
    private Instant departureTime;

    @Column(name = "arrivalTime", nullable = false)
    private Instant arrivalTime;

}