package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Guest extends PanacheEntity {
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String email;
    private String passNumber;
    private String address;
    @OneToMany
    private List<Reservation> reservationList;
}
