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
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LaundryService extends PanacheEntity {
    @OneToOne
    private Laundry laundry;
    @OneToMany
    private List<Staff> staff;
    private float price;

}
