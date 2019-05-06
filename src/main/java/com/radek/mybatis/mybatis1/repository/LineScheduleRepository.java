package com.radek.mybatis.mybatis1.repository;

import com.radek.mybatis.mybatis1.AppConstants;
import com.radek.mybatis.mybatis1.entity.Line;
import com.radek.mybatis.mybatis1.entity.LineSchedule;
import com.radek.mybatis.mybatis1.entity.Stop;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface LineScheduleRepository {

    @Select("select * from line_schedules where line_id=#{lineId} order by position")
    @Results({
            @Result(column = "stop_id",property = "stop", javaType = Stop.class,
            one = @One(select = AppConstants.SELECT_STOP_BY_ID)),
            @Result(column = "final_stop_id",property = "finalStop", javaType = Stop.class,
                    one = @One(select = AppConstants.SELECT_STOP_BY_ID)),
            @Result(column = "line_id", property = "line", javaType = Line.class,
            one = @One(select = AppConstants.SELECT_LINE_BY_ID))
    })
    List<LineSchedule> findAllByLineId(Long lineId);

}
