package com.radek.mybatis.mybatis1.mapper;

import com.radek.mybatis.mybatis1.dto.LineStopDTO;
import com.radek.mybatis.mybatis1.entity.LineStop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LineStopMapper {

    @Mappings({
            @Mapping(target = "line", source = "line.name"),
            @Mapping(target = "finalStop", source = "finalStop.name"),
            @Mapping(target = "stop", source = "stop.name")
    })
    LineStopDTO toDTO(LineStop lineStop);

    List<LineStopDTO> toDTO(List<LineStop> lineStops);

}
