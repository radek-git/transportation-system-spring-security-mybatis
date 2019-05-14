package com.radek.mybatis.mybatis1.mapper;

import com.radek.mybatis.mybatis1.dto.VehicleDTO;
import com.radek.mybatis.mybatis1.entity.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleMapper {

    @Mappings({
            @Mapping(target = "transportType", source = "transportType.name")
    })
    VehicleDTO toDTO(Vehicle vehicle);

    List<VehicleDTO> toDTO(List<Vehicle> vehicles);
}
