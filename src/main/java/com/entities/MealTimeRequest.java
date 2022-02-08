package com.entities;

import com.enumeration.MealType;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MealTimeRequest extends PanacheEntity {

    @Enumerated(EnumType.STRING)
    private MealType mealType;
    @OneToOne
    private MenuItem menuItem;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm a")
    private LocalDateTime orderTime;
   @ManyToOne
    private RoomService roomService;
}
