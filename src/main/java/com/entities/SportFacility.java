package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SportFacility extends PanacheEntity {

    @OneToMany
    private List<Staff> staffList;
    @OneToMany
    private List<LocalDateTimes>localDateTimesList;
    private String Location;
    private String description;
}
