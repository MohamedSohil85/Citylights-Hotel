package com.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Menu extends PanacheEntity {
    @OneToMany
    private List<MenuItem> menuItemList;
}
