package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Reports extends PanacheEntity {
    @OneToMany
    List<Guest> guestList;
    @OneToMany
    List<Reservation>reservationList;
    @OneToMany
    List<Reviews>reviewsList;
    @OneToMany
    List<RestaurantBooking>restaurantBookingList;
    @OneToMany
    List<RoomHouseKeeping>roomHouseKeepings;
    @OneToOne
    private LaundryService laundryService;
    @OneToOne
    private RoomService roomService;
    @OneToMany
    private List<Events>events;
}
