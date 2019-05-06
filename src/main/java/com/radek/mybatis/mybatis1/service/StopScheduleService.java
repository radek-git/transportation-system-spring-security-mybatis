package com.radek.mybatis.mybatis1.service;

import com.radek.mybatis.mybatis1.entity.StopSchedule;
import com.radek.mybatis.mybatis1.repository.StopScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopScheduleService {

    private StopScheduleRepository stopScheduleRepository;

    @Autowired
    public StopScheduleService(StopScheduleRepository stopScheduleRepository) {
        this.stopScheduleRepository = stopScheduleRepository;
    }

    public List<StopSchedule> findAll() {
        return stopScheduleRepository.findAll();
    }
}
