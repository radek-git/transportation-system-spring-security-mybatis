package com.radek.mybatis.mybatis1.repository;

import com.radek.mybatis.mybatis1.entity.Driver;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface DriverRepository {

    @Select("select * from drivers")
    List<Driver> findAll();

    @Select("select * from drivers where id=#{id}")
    Optional<Driver> findById(Long id);

    @Select("select * from drivers where pesel=#{pesel}")
    Optional<Driver> findByPesel(String pesel);

    @Select("select * from drivers where surname=#{surname}")
    Optional<Driver> findBySurname(String surname);


}
