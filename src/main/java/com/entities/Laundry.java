package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Laundry extends PanacheEntity {

    private Date laundry_open_time;
    private Date laundry_close_time;
    private String laundry_details;
}
