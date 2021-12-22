package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class RestaurantBooking extends PanacheEntity {
    @OneToOne
    private Restaurant restaurant;
    @ManyToOne
    private Guest guest;
    private Date bookingDate;
    private double price;
    private int tableNr;

}
