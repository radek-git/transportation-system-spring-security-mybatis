package com.radek.mybatis.mybatis1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineScheduleDTO implements Serializable {

    private Long lineId;
    private Long finalStopId;
    private Long position;
    private Long stopId;

}
