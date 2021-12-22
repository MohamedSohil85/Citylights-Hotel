package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
public class Events extends PanacheEntity {

    private Date startTime;
    private Date endTime;
    private String location;
    private float booking_price;
    @OneToMany
    private List<Guest>guests;
    private int capatcity;

}
