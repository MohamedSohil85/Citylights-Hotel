package com.entities;

import com.enumeration.RoomStatus;
import com.enumeration.RoomStyle;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Room extends PanacheEntity {

    private int roomNumber;
    private double bookingPrice;
    @Enumerated(EnumType.STRING)
    private RoomStatus roomStatus;
    @Enumerated(EnumType.STRING)
    private RoomStyle roomStyle;
    private String details;
    private boolean isSmoking;

}
