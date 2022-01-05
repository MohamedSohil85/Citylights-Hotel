package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Hotel extends PanacheEntity {

    private String name;
    private String phone;
    private String email;
    private String address;
    private String hotelService;
    @OneToOne
    private Restaurant restaurant;
    @OneToMany
    private List<LocalDateTimes> reception;
    @OneToMany
    private List<Staff>staffs;
    @OneToMany
    private List<Room> roomList;
    @OneToMany
    private List<Reviews>reviewsList;
}
