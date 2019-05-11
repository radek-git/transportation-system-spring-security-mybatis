package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.dto.LineDTO;
import com.radek.mybatis.mybatis1.dto.LineStopDTO;
import com.radek.mybatis.mybatis1.entity.Line;
import com.radek.mybatis.mybatis1.mapper.LineMapper;
import com.radek.mybatis.mybatis1.mapper.LineStopMapper;
import com.radek.mybatis.mybatis1.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LineController {

    private LineService lineService;
    private LineMapper lineMapper;
    private LineStopMapper lineStopMapper;

    @Autowired
    public LineController(LineService lineService, LineMapper lineMapper, LineStopMapper lineStopMapper) {
        this.lineService = lineService;
        this.lineMapper = lineMapper;
        this.lineStopMapper = lineStopMapper;
    }

    @GetMapping("/lines")
    public List<LineDTO> findAll() {
        return lineMapper.toDTO(lineService.findAll());
    }

//    @GetMapping("lines/{id}")
//    public LineDTO findById(@PathVariable Long id) {
//        return lineMapper.toDTO(lineService.findById(id));
//    }

    @GetMapping("/lines/{name}")
    public LineDTO findByName(@PathVariable String name) {
        return lineMapper.toDTO(lineService.findByName(name));
    }

    @GetMapping("/lines/{name}/stops")
    public List<LineStopDTO> findAllLineStopsByLineName(@PathVariable String name) {
        return lineStopMapper.toDTO(lineService.findByName(name).getLineStops());
    }
}
