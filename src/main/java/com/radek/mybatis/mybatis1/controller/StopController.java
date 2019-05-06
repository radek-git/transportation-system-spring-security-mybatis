package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.entity.Stop;
import com.radek.mybatis.mybatis1.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StopController {

    private StopService stopService;

    @Autowired
    public StopController(StopService stopService) {
        this.stopService = stopService;
    }


    @GetMapping("/stops")
    public List<Stop> findAll() {
        return stopService.findAll();
    }

    @GetMapping("/stops/{id}")
    public Stop findById(@PathVariable Long id) {
        return stopService.findById(id);
    }
}
