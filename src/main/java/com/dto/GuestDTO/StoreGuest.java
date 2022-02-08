package com.dto.GuestDTO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class StoreGuest {

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

}
