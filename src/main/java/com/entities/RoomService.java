package com.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RoomService extends PanacheEntity {

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm a")
    private LocalDateTime serviceDate;
    @OneToOne
    private Guest guest;
    @ManyToOne
    private Room room;
    @OneToMany(mappedBy = "roomService")
    private List<MealTimeRequest>mealTimeRequests;
    private double totalPrice;
}
