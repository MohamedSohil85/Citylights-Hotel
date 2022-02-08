package com.dto.StaffDTO;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountCreation {

    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String country;
    private String city;
    private String zip;
    private String street;
}
