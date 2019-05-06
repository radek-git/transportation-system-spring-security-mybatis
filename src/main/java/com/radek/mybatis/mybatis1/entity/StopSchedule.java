package com.radek.mybatis.mybatis1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StopSchedule extends AbstractEntity{

    private Line line;
    private LocalDateTime arrivesAt;
    private Stop stop;
    private DayOfWeek dayOfWeek;
}
