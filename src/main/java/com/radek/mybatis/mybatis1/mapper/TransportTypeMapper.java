package com.radek.mybatis.mybatis1.mapper;

import com.radek.mybatis.mybatis1.dto.TransportTypeDTO;
import com.radek.mybatis.mybatis1.entity.TransportType;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransportTypeMapper {


    TransportTypeDTO toDTO(TransportType transportType);

    List<TransportTypeDTO> toDTO(List<TransportType> transportTypes);
}
