package com.repository;

import com.entities.Room;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RoomRepository implements PanacheRepository<Room> {
}
