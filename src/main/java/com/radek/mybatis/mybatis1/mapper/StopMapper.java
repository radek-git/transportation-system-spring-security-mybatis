package com.radek.mybatis.mybatis1.mapper;

import com.radek.mybatis.mybatis1.dto.StopDTO;
import com.radek.mybatis.mybatis1.entity.Stop;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StopMapper {

    @Mappings({
            @Mapping(target = "transportType", source = "transportType.name")
    })
    StopDTO toDTO(Stop stop);

    List<StopDTO> toDTO(List<Stop> stops);
}
