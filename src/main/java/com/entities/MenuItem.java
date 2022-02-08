package com.entities;

import com.enumeration.Categories;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuItem extends PanacheEntity {

    private String itemName;
    private double price;
    private String ingredients;
    @Enumerated(EnumType.STRING)
    private Categories categories;

}
