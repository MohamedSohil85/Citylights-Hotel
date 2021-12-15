package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
public class RoomHouseKeeping extends PanacheEntity {
    private Date startTime;
    private Date endTime;
    private String Description;
    @OneToMany
    private List<Room> rooms;
    @OneToMany
    private List<Staff>staffList;


}
