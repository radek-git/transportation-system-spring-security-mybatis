package com.radek.mybatis.mybatis1.mapper;

import com.radek.mybatis.mybatis1.dto.StopLineDTO;
import com.radek.mybatis.mybatis1.entity.StopLine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StopLineMapper {


    @Mappings({
            @Mapping(target = "line", source = "line.name"),
            @Mapping(target = "stop", source = "stop.name"),
            @Mapping(target = "dayOfWeek", source = "dayOfWeek.name"),
    })
    StopLineDTO toDTO(StopLine stopLine);



    List<StopLineDTO> toDTO(List<StopLine> stopLines);
}
