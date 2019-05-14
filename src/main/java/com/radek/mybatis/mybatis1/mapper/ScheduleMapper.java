package com.radek.mybatis.mybatis1.mapper;

import com.radek.mybatis.mybatis1.dto.ScheduleDTO;
import com.radek.mybatis.mybatis1.entity.Schedule;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ScheduleMapper {

    @Mappings({
            @Mapping(target = "line", source = "line.name"),
            @Mapping(target = "vehicleId", source = "vehicle.id"),
            @Mapping(target = "driverId", source = "driver.id"),
            @Mapping(target = "startsAt", source = "startsAt"),
            @Mapping(target = "endsAt", source = "endsAt"),
            @Mapping(target = "startStop", source = "startStop.name"),
            @Mapping(target = "endStop", source = "endStop.name")
    })
    ScheduleDTO toDTO(Schedule schedule);

    List<ScheduleDTO> toDTO(List<Schedule> schedules);

}
