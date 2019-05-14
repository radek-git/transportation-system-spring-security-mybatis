package com.radek.mybatis.mybatis1.repository;

import com.radek.mybatis.mybatis1.AppConstants;
import com.radek.mybatis.mybatis1.entity.Line;
import com.radek.mybatis.mybatis1.entity.TransportType;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface LineRepository {




    @Select("select * from lines")
    @Results({
            @Result(column = "id", property = "id", javaType = Long.class),
            @Result(column = "transport_type_id", property = "transportType", javaType = TransportType.class,
                    one = @One(select = AppConstants.SELECT_TRANSPORT_TYPE)),
            @Result(column ="id" ,property = "lineStops" ,javaType = List.class,
                    many = @Many(select = AppConstants.SELECT_LINE_STOPS_BY_LINE_ID))
    })
    List<Line> findAll();

    @Select("select * from lines where id=#{id}")
    @Results({
            @Result(column = "id", property = "id", javaType = Long.class),
            @Result(column = "transport_type_id", property = "transportType", javaType = TransportType.class,
                    one = @One(select = AppConstants.SELECT_TRANSPORT_TYPE)),
            @Result(column ="id" ,property = "lineStops" ,javaType = List.class,
                    many = @Many(select = AppConstants.SELECT_LINE_STOPS_BY_LINE_ID))
    })
    Optional<Line> findById(Long id);


    @Select("select * from lines where name=#{name}")
    @Results({
            @Result(column = "id", property = "id", javaType = Long.class),
            @Result(column = "transport_type_id", property = "transportType", javaType = TransportType.class,
                    one = @One(select = AppConstants.SELECT_TRANSPORT_TYPE)),
            @Result(column ="id" ,property = "lineStops" ,javaType = List.class,
                    many = @Many(select = AppConstants.SELECT_LINE_STOPS_BY_LINE_ID))
    })
    Optional<Line> findByName(String name);
}
