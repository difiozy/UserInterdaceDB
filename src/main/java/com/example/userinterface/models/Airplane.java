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
import java.math.BigDecimal;

@Entity
@Table(name = "airplanes")
@Data
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airplaneId", nullable = false)
    private Integer id;

    @Column(name = "capacityEconomClass", nullable = false)
    private Integer capacityEconomClass;

    @Column(name = "capacityBusinessClass", nullable = false)
    private Integer capacityBusinessClass;

    @Column(name = "lenght", precision = 3, scale = 1)
    private BigDecimal lenght;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ownerCompanyId", nullable = false)
    private Company ownerCompany;



}