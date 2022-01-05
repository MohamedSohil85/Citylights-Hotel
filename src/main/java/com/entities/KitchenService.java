package com.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class KitchenService extends PanacheEntity {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate requestDate;
    @JsonFormat(pattern = "hh:mm a")
    private LocalTime requesttime;
    @OneToOne
    private RoomService roomService;
    @ManyToOne
    private Staff staff;


}
