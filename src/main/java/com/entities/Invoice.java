package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Invoice extends PanacheEntity {

    private int billNr;
    @OneToOne
    private Reservation reservation;
    @OneToOne
    private RestaurantBooking restaurantBooking;

}
