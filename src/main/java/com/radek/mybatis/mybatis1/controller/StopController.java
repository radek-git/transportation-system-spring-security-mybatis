package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.dto.StopDTO;
import com.radek.mybatis.mybatis1.dto.StopLineDTO;
import com.radek.mybatis.mybatis1.entity.Stop;
import com.radek.mybatis.mybatis1.mapper.StopLineMapper;
import com.radek.mybatis.mybatis1.mapper.StopMapper;
import com.radek.mybatis.mybatis1.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class StopController {

    private StopService stopService;
    private StopMapper stopMapper;
    private StopLineMapper stopLineMapper;

    @Autowired
    public StopController(StopService stopService, StopMapper stopMapper, StopLineMapper stopLineMapper) {
        this.stopService = stopService;
        this.stopMapper = stopMapper;
        this.stopLineMapper = stopLineMapper;
    }

    @GetMapping("/stops")
    public List<StopDTO> findAll() {
        return stopMapper.toDTO(stopService.findAll());
    }

    @GetMapping("/stops/{id}")
    public StopDTO findById(@PathVariable Long id) {
        return stopMapper.toDTO(stopService.findById(id));
    }

    @GetMapping("/stops/{stopName}/{lineName}")
    public List<StopLineDTO> findAllStopLinesByLineName(@PathVariable String stopName, @PathVariable String lineName) {
        return stopLineMapper.toDTO(stopService.findByName(stopName).getStopLines().stream()
                .filter(stopLine -> stopLine.getLine().getName().equals(lineName)).collect(Collectors.toList()));
    }
}


// dokończyć mappery
// w mapperach zmienić z dto na entity
// dokończyć endpointy