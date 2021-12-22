package com.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Reservation extends PanacheEntity {
    @ManyToOne
    private Guest guest;
    @ManyToOne
    private Room room;
    private int adultNr;
    private int childNr;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date checkIn;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date checkOut;
    private float price;
    private Date reservationDate;
}
