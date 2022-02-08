package com.services;

import com.dto.HotelDTO.HotelCreationDTO;
import com.entities.Hotel;
import com.entities.LocalDateTimes;
import com.repository.HotelInfoStore;

import javax.inject.Inject;
import javax.ws.rs.core.Response;

public class HotelService {
    @Inject
    HotelInfoStore hotelInfoStore;

    HotelCreationDTO hotelCreationDTO;


}
