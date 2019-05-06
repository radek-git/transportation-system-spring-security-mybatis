package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.entity.StopSchedule;
import com.radek.mybatis.mybatis1.service.StopScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StopScheduleController {

    private StopScheduleService stopScheduleService;

    @Autowired
    public StopScheduleController(StopScheduleService stopScheduleService) {
        this.stopScheduleService = stopScheduleService;
    }

    @GetMapping("/stopschedules")
    public List<StopSchedule> findAll() {
        return stopScheduleService.findAll();
    }
}
