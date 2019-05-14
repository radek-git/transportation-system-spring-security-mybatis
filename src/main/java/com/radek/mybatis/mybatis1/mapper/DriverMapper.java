package com.radek.mybatis.mybatis1.mapper;

import com.radek.mybatis.mybatis1.dto.DriverDTO;
import com.radek.mybatis.mybatis1.entity.Driver;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DriverMapper {


    @Mappings({
            @Mapping(target = "name", source = "name"),
            @Mapping(target = "surname", source = "surname")

    })
    DriverDTO toDTO(Driver driver);

    List<DriverDTO> toDTO(List<Driver> drivers);
}
