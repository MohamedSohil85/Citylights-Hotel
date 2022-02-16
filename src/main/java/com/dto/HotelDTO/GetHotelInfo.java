package com.dto.HotelDTO;

import com.entities.LocalDateTimes;
import lombok.*;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GetHotelInfo {

    private String phone;
    private String email;
    private String website;
    private String address;
    private List<LocalDateTimes> localDateTimesList;
}
