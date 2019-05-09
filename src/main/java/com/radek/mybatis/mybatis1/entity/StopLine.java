package com.radek.mybatis.mybatis1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

//dot. linii które odchodzą z danego prZystanku

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StopLine extends AbstractEntity{

    private Stop stop;
    private Line line;

    private LocalTime arrivesAt;
    private DayOfWeek dayOfWeek;
}
