package com.repository;

import com.entities.Guest;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GuestRepository implements PanacheRepository<Guest> {
}
