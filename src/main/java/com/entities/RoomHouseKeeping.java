package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoomHouseKeeping extends PanacheEntity {
    private Date startTime;
    private Date endTime;
    private String Description;
    @OneToMany
    private List<Room> rooms;
    @OneToMany
    private List<Staff>staffList;


}
