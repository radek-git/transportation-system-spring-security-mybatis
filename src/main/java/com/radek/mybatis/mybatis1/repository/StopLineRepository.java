package com.radek.mybatis.mybatis1.repository;

import com.radek.mybatis.mybatis1.AppConstants;
import com.radek.mybatis.mybatis1.entity.DayOfWeek;
import com.radek.mybatis.mybatis1.entity.Line;
import com.radek.mybatis.mybatis1.entity.Stop;
import com.radek.mybatis.mybatis1.entity.StopLine;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StopLineRepository {

    @Select("select * from stop_lines")
    @Results({
            @Result(column = "day_of_week_id", property = "dayOfWeek", javaType = DayOfWeek.class,
            one = @One(select = AppConstants.SELECT_DAY_OF_WEEK_BY_ID)),
            @Result(column = "stop_id", property = "stop", javaType = Stop.class,
            one = @One(select = AppConstants.SELECT_STOP_BY_ID)),
            @Result(column = "line_id", property = "line", javaType = Line.class,
            one = @One(select = AppConstants.SELECT_LINE_BY_ID))
    })
    List<StopLine> findAll();



    @Select("select * from stop_lines where stop_id=#{stopId} order by day_of_week_id, arrives_at")
    @Results({
            @Result(column = "day_of_week_id", property = "dayOfWeek", javaType = DayOfWeek.class,
                    one = @One(select = AppConstants.SELECT_DAY_OF_WEEK_BY_ID)),
            @Result(column = "stop_id", property = "stop", javaType = Stop.class,
                    one = @One(select = AppConstants.SELECT_STOP_BY_ID)),
            @Result(column = "line_id", property = "line", javaType = Line.class,
                    one = @One(select = AppConstants.SELECT_LINE_BY_ID))
    })
    List<StopLine> findAllByStopId(Long id);
}
