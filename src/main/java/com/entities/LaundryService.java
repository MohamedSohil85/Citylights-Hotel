package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LaundryService extends PanacheEntity {
    @OneToOne
    private Laundry laundry;
    @OneToOne
    private Staff staff;
    private float price;

}
