package com.radek.mybatis.mybatis1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StopScheduleDTO implements Serializable {

    private Long lineId;
    private LocalDateTime arrivesAt;
    private Long stopId;
    private Long dayOfWeekId;
}
