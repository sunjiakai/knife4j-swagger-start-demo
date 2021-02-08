package com.knife4j.sjk.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Data
@ToString
public class DateDTO implements Serializable {
    private Date date;
    private LocalDateTime dt;
    private LocalDate d;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private LocalTime t;
}
