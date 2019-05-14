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

    @Select("select * from schedules where vehicle_id=#{vehicleId}")
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
    List<Schedule> findAllByVehicleId(Long vehicleId);

    @Select("select * from schedules where driver_id=#{driverId}")
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
    List<Schedule> findAllByDriverId(Long driverId);


    @Select("select * from schedules where driver_id=#{driverId} and vehicle_id=#{vehicleId}")
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
    List<Schedule> findAllByVehicleIdAndDriverId(Long vehicleId, Long driverId);





    //dopisane

    @Select("SELECT s.id, s.line_id, s.vehicle_id, s.driver_id, s.starts_at, s.ends_at, s.start_stop_id, " +
            "s.end_stop_id FROM SCHEDULES as s\n" +
            "    join stops on stops.id=s.start_stop_id" +
            "    where stops.name=#{startStop} and driver_id=#{driverId}")

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
    List<Schedule> findAllByDriverIdAndStartStop(Long driverId, String startStop);


    @Select("SELECT s.id, s.line_id, s.vehicle_id, s.driver_id, s.starts_at, s.ends_at, s.start_stop_id, " +
            "s.end_stop_id FROM SCHEDULES as s\n" +
            "    join stops on stops.id=s.start_stop_id" +
            "    where stops.name=#{startStop}")
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
    List<Schedule> findAllByStartStop(String startStop);


    @Select("SELECT s.id, s.line_id, s.vehicle_id, s.driver_id, s.starts_at, s.ends_at, s.start_stop_id, " +
            "s.end_stop_id FROM SCHEDULES as s\n" +
            "    join stops on stops.id=s.start_stop_id" +
            "    where stops.name=#{startStop} and vehicle_id=#{vehicleId}")
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
    List<Schedule> findAllByVehicleIdAndStartStop(Long vehicleId, String startStop);


    @Select("SELECT s.id, s.line_id, s.vehicle_id, s.driver_id, s.starts_at, s.ends_at, s.start_stop_id, " +
            "s.end_stop_id FROM SCHEDULES as s\n" +
            "    join stops on stops.id=s.start_stop_id" +
            "    where stops.name=#{startStop} and vehicle_id=#{vehicleId} and driver_id=#{driverId}")
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
    List<Schedule> findAllByVehicleIdAndDriverIdAndStartStop(Long vehicleId, Long driverId, String startStop);
}
