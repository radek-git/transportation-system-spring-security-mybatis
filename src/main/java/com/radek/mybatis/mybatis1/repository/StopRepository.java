package com.radek.mybatis.mybatis1.repository;

import com.radek.mybatis.mybatis1.AppConstants;
import com.radek.mybatis.mybatis1.entity.Stop;
import com.radek.mybatis.mybatis1.entity.StopLine;
import com.radek.mybatis.mybatis1.entity.TransportType;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface StopRepository {

    @Select("select * from stops")
    @Results({
            @Result(column = "transport_type_id", property = "transportType", javaType = TransportType.class,
                    one = @One(select = AppConstants.SELECT_TRANSPORT_TYPE)),
            @Result(column = "id", property = "stopLines", javaType = List.class,
            many = @Many(select = AppConstants.SELECT_STOP_LINES_BY_STOP_ID)),
            @Result(column = "is_terminal", property = "isTerminal", javaType = Boolean.class)

    })
    List<Stop> findAll();

    @Select("select * from stops where id=#{id}")
    @Results({
            @Result(column = "transport_type_id", property = "transportType", javaType = TransportType.class,
                    one = @One(select = AppConstants.SELECT_TRANSPORT_TYPE)),
            @Result(column = "id", property = "stopLines", javaType = List.class,
                    many = @Many(select = AppConstants.SELECT_STOP_LINES_BY_STOP_ID)),
            @Result(column = "is_terminal", property = "isTerminal", javaType = Boolean.class)
    })
    Optional<Stop> findById(Long id);


    @Select("select * from stops where name=#{stopName}")
    @Results({
            @Result(column = "transport_type_id", property = "transportType", javaType = TransportType.class,
                    one = @One(select = AppConstants.SELECT_TRANSPORT_TYPE)),
            @Result(column = "id", property = "stopLines", javaType = List.class,
                    many = @Many(select = AppConstants.SELECT_STOP_LINES_BY_STOP_ID)),
            @Result(column = "is_terminal", property = "isTerminal", javaType = Boolean.class)
    })
    Optional<Stop> findByName(String stopName);
}
