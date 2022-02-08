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
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Restaurant extends PanacheEntity {

    private String name;
    @OneToMany
    private List<LocalDateTimes> localDateTimesList;
    private String location;
    @OneToMany
    private List<Staff>staffList;
    @OneToOne
    private Menu menu;
}
