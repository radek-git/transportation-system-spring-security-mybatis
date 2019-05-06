package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.entity.Line;
import com.radek.mybatis.mybatis1.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LineController {

    private LineService lineService;

    @Autowired
    public LineController(LineService lineService) {
        this.lineService = lineService;
    }

    @GetMapping("/lines")
    public List<Line> findAll() {
        return lineService.findAll();
    }

    @GetMapping("lines/{id}")
    public Line findById(@PathVariable Long id) {
        return lineService.findById(id);
    }
}
