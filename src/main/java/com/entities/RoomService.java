package com.entities;

import com.enumeration.MealType;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class RoomService extends PanacheEntity {
    @ManyToOne
    private Staff staff;
    private Date serviceDate;
    @ManyToOne
    private Room room;
    private MealType mealType;
}
