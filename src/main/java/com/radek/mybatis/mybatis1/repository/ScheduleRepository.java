package com.radek.mybatis.mybatis1.repository;

import com.radek.mybatis.mybatis1.AppConstants;
import com.radek.mybatis.mybatis1.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ScheduleRepository {

    @Select("select * from schedules")
    @Results({
            @Result(column = "line_id", property = "line", javaType = Line.class,
                    one = @One(select = AppConstants.SELECT_LINE_BY_ID)),
            @Result(column = "vehicle_id", property = "vehicle", javaType = Vehicle.class,
            one = @One(select = AppConstants.SELECT_VEHICLE_BY_ID)),
            @Result(column = "driver_id", property = "driver", javaType = Driver.class,
                    one = @One(select = AppConstants.SELECT_DRIVER_BY_ID)),
            @Result(column = "start_stop_id", property = "startStop", javaType = Stop.class,
            one = @One(select = AppConstants.SELECT_STOP_BY_ID)),
            @Result(column = "end_stop_id", property = "endStop", javaType = Stop.class,
                    one = @One(select = AppConstants.SELECT_STOP_BY_ID))
    })
    List<Schedule> findAll();
}
