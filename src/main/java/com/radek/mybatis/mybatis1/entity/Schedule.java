package com.radek.mybatis.mybatis1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Schedule extends AbstractEntity {

    private Line line;
    private Vehicle vehicle;
    private Driver driver;
    private LocalDateTime startsAt;
    private LocalDateTime endsAt;
    private Stop startStop;
    private Stop endStop;
}
