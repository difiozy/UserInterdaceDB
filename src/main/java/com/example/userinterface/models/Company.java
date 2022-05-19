package com.example.userinterface.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "companies")
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "companyId", nullable = false)
    private Integer id;

    @Column(name = "name", length = 40)
    private String name;

    @Column(name = "contactNumber", length = 40)
    private String contactNumber;


}