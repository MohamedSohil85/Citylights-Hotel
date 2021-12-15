package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Staff extends PanacheEntity {
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String address;
    private String username;
    private String password;
}
