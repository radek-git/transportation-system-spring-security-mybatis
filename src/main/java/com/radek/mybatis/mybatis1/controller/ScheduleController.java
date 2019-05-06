package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.entity.Schedule;
import com.radek.mybatis.mybatis1.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScheduleController {

    private ScheduleService scheduleService;

    @Autowired
    public ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping("/schedules")
    public List<Schedule> findAll() {
        return scheduleService.findAll();
    }
}
