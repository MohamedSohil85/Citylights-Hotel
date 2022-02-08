package com.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class KitchenService extends PanacheEntity {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate requestDate;
    @JsonFormat(pattern = "hh:mm a")
    private LocalTime requestTime;
    @OneToOne
    private LocalDateTimes localDateTimes;
    @OneToMany
    private List<RoomService> roomServices;
    @OneToMany
    private List<Staff> staffs;


}
