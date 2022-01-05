package com.repository;

import com.entities.Reservation;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ReservationStore implements PanacheRepository<Reservation> {
}
