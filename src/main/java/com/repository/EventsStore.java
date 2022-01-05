package com.repository;

import com.entities.Events;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EventsStore implements PanacheRepository<Events> {
}
