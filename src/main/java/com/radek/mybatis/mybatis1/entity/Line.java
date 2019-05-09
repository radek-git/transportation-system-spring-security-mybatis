package com.radek.mybatis.mybatis1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Line extends AbstractEntity {

    private String name;
    //    private Long transportTypeId;
    private TransportType transportType;

    private List<LineStop> lineStops = new ArrayList<>();


}
