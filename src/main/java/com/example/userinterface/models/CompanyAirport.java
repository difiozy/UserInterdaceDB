package com.example.userinterface.models;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "company_airport")
@Data
public class CompanyAirport {
    @EmbeddedId
    private CompanyAirportId id;

    @MapsId("companyId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "companyId", nullable = false)
    private Company company;

    @MapsId("airportId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "airportId", nullable = false)
    private Airport airport;

}