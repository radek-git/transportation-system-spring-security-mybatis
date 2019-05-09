package com.radek.mybatis.mybatis1.dto;

import com.radek.mybatis.mybatis1.entity.Stop;
import com.radek.mybatis.mybatis1.entity.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScheduleDTO implements Serializable {

    private String line;
    private Long vehicleId;
    private Long driverId;
    private LocalDateTime startsAt;
    private LocalDateTime endsAt;
    private String startStop;
    private String endStop;


}
