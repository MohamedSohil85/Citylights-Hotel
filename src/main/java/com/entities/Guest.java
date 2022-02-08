package com.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Guest extends PanacheEntity {

    private String lastName;
    private String firstName;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    private String phoneNumber;
    private String email;
    private String passNumber;
    private String country;
    private String city;
    private String zip;
    private String street;
    @OneToMany
    private List<Reservation> reservationList;
}
