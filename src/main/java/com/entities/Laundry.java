package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Laundry extends PanacheEntity {
     @OneToMany
     private List<LocalDateTimes>localDateTimesList;
    private String laundry_details;
}
