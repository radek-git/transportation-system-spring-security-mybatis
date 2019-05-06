package com.radek.mybatis.mybatis1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDTO implements Serializable {

    private Long lineId;
    private Long vehicleId;
    private Long driverId;


}
