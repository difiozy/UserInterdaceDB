package com.example.userinterface.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientId", nullable = false)
    private Integer id;

    @Column(name = "passportNumber", nullable = false, length = 45)
    private String passportNumber;

    @Column(name = "firstName", nullable = false, length = 45)
    private String firstName;

    @Column(name = "secondName", nullable = false, length = 45)
    private String secondName;

    @Column(name = "phoneNumber", length = 12)
    private String phoneNumber;

    @Column(name = "email", length = 45)
    private String email;




}