package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sales extends PanacheEntity {

    private double totalPrice;
    @OneToMany
    private List<Reservation>reservationList;
    @OneToMany
    private List<RestaurantBooking>restaurantBookingList;
    @ManyToOne
    private SportFacility sportFacility;
    @ManyToOne
    private LaundryService laundryService;
    @ManyToOne
    private SportReservation sportReservation;
}
