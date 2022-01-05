package com.repository;

import com.entities.Staff;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StaffRepository implements PanacheRepository<Staff> {
}
