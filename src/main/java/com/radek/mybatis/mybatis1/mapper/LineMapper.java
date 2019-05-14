package com.radek.mybatis.mybatis1.mapper;

import com.radek.mybatis.mybatis1.dto.LineDTO;
import com.radek.mybatis.mybatis1.entity.Line;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LineMapper {


    @Mappings({
            @Mapping(target = "transportType", source = "transportType.name"),
    })
    LineDTO toDTO(Line line);

    List<LineDTO> toDTO(List<Line> lines);



}
