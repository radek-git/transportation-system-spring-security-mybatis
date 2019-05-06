package com.radek.mybatis.mybatis1.service;

import com.radek.mybatis.mybatis1.entity.DayOfWeek;
import com.radek.mybatis.mybatis1.repository.DayOfWeekRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DayOfWeekService {

    private DayOfWeekRepository dayOfWeekRepository;

    @Autowired
    public DayOfWeekService(DayOfWeekRepository dayOfWeekRepository) {
        this.dayOfWeekRepository = dayOfWeekRepository;
    }

    public List<DayOfWeek> findAll() {
        return dayOfWeekRepository.findAll();
    }

    public DayOfWeek findByName(String name) {
        return dayOfWeekRepository.findByName(name);
    }


    public DayOfWeek findById(Long id) {
        return dayOfWeekRepository.findById(id);
    }
}
