package com.entities;

import com.enumeration.MealType;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class RoomService extends PanacheEntity {
    @ManyToOne
    private Staff staff;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm a")
    private LocalDateTime serviceDate;
    @ManyToOne
    private Room room;
    @OneToOne
    private Menu menu;
    private MealType mealType;
    private double price;
}
