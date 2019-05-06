package com.radek.mybatis.mybatis1.repository;

import com.radek.mybatis.mybatis1.entity.TransportType;
import com.radek.mybatis.mybatis1.entity.Vehicle;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface VehicleRepository {

    @Select("select * from vehicles")
    @Results({
            @Result(column = "transport_type_id", property = "transportType", javaType = TransportType.class,
                    one = @One(select = "com.radek.mybatis.mybatis1.repository.TransportTypeRepository.findOne"))
    })
    List<Vehicle> findAll();

    @Select("select * from vehicles where id=#{id}")
    @Results({
            @Result(column = "transport_type_id", property = "transportType", javaType = TransportType.class,
                    one = @One(select = "com.radek.mybatis.mybatis1.repository.TransportTypeRepository.findOne"))
    })
    Optional<Vehicle> findById(Long id);
}
