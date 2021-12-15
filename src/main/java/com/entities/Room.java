package com.entities;

import com.enumeration.RoomStatus;
import com.enumeration.RoomStyle;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Room extends PanacheEntity {

    private int roomNumber;
    private double bookingPrice;
    private RoomStatus roomStatus;
    private RoomStyle roomStyle;
    private boolean isSmoking;

}
