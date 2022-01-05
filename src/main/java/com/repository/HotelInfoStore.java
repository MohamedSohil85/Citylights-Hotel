package com.repository;

import com.entities.Hotel;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HotelInfoStore implements PanacheRepository<Hotel> {
}
