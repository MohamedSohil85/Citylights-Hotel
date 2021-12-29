package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Staff extends PanacheEntity {

    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String country;
    private String city;
    private String zip;
    private String street;
    private String username;
    private String password;
    @OneToMany
    private List<Role> roleList;
}
