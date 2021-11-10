package entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Room extends PanacheEntity {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;
}
