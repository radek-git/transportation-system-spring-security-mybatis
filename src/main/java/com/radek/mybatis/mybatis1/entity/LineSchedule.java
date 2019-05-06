package com.radek.mybatis.mybatis1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LineSchedule extends AbstractEntity{

    private Line line;
    private Stop finalStop;
    private Long position;
    private Stop stop;
}
