package com.entities;

import com.enumeration.RoomStatus;
import com.enumeration.RoomStyle;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Room extends PanacheEntity {

    private int roomNumber;
    private double bookingPrice;
    private RoomStatus roomStatus;
    private RoomStyle roomStyle;
    private String details;
    private boolean isSmoking;

}
