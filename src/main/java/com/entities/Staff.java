package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.security.jpa.Password;
import io.quarkus.security.jpa.Roles;
import io.quarkus.security.jpa.UserDefinition;
import io.quarkus.security.jpa.Username;
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
@UserDefinition

public class Staff extends PanacheEntity {

    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String country;
    private String city;
    private String zip;
    private String street;
    @Username
    private String username;
    @Password
    private String password;
    @OneToMany
    @Roles
    private List<Role> roleList;
}
