package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.dto.StopLineDTO;
import com.radek.mybatis.mybatis1.entity.StopLine;
import com.radek.mybatis.mybatis1.mapper.StopLineMapper;
import com.radek.mybatis.mybatis1.service.StopScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StopLineController {

    private StopScheduleService stopScheduleService;
    private StopLineMapper stopLineMapper;


    @Autowired
    public StopLineController(StopScheduleService stopScheduleService, StopLineMapper stopLineMapper) {
        this.stopScheduleService = stopScheduleService;
        this.stopLineMapper = stopLineMapper;
    }

    @GetMapping("/stoplines")
    public List<StopLineDTO> findAll() {
        return stopLineMapper.toDTO(stopScheduleService.findAll());
    }
}
