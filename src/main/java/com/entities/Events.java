package com.entities;


import com.enumeration.RoomConfiguration;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Events extends PanacheEntity {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate eventDate;
    @JsonFormat(pattern = "hh:mm a")
    private LocalTime eventTime;
    private int RoomNr;
    private float booking_price;
    private int capacity;
    private int size;
    private RoomConfiguration roomConfiguration;
    @OneToMany
    private List<Guest>guests;

}
