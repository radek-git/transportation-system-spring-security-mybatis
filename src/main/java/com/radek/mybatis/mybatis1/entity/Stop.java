package com.radek.mybatis.mybatis1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stop extends AbstractEntity{

    private String name;
    private String latitude;
    private String longitude;
    private TransportType transportType;
    private boolean isTerminal;

    private List<StopSchedule> stopSchedules = new ArrayList<>();

}
