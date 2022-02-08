package com.dto.StaffDTO;

import com.entities.Role;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GetStaffByName {

    private String lastName;
    private String firstName;
    private String phoneNumber;
    private String country;
    private String city;
    private String zip;
    private String street;
    private List<Role> roleList;
}
