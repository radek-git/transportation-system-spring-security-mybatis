package com.radek.mybatis.mybatis1.repository;

import com.radek.mybatis.mybatis1.entity.DayOfWeek;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DayOfWeekRepository {

    @Select("select * from days_of_week")
    public List<DayOfWeek> findAll();

    @Select("select * from days_of_week where name=#{name}")
    public DayOfWeek findByName(String name);

    @Select("select * from days_of_week where id=#{id}")
    public DayOfWeek findById(Long id);
}

//dokończyć mapowania- line i stop.
//stop ma mieć listę StopLine
//całe api ma operować na dto - dla każdej klasy i zamiast obiektów mają być id
//zmodyfikować kontrolery - mają wyświetlać dto a nie entity