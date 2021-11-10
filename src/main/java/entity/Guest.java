package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;


import javax.persistence.Entity;

@Entity
public class Guest extends PanacheEntity {
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String email;
    private String passNumber;
    private String address;
}
