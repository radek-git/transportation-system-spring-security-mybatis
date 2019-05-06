package com.radek.mybatis.mybatis1.repository;

import com.radek.mybatis.mybatis1.entity.TransportType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TransportTypeRepository {

    @Select("select * from transport_types where id=#{id}")
    TransportType findOne(Long id);
}
