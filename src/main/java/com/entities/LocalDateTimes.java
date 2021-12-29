package com.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LocalDateTimes extends PanacheEntity {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate reception_OpeningDate;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date reception_CloseDate;
    @JsonFormat(pattern = "hh:mm a")
    private LocalTime open_time;
    @JsonFormat(pattern = "hh:mm a")
    private LocalTime close_time;

}
