package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.dto.TransportTypeDTO;
import com.radek.mybatis.mybatis1.mapper.TransportTypeMapper;
import com.radek.mybatis.mybatis1.service.TransportTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransportTypeController {

    private TransportTypeService transportTypeService;
    private TransportTypeMapper transportTypeMapper;

    @Autowired
    public TransportTypeController(TransportTypeService transportTypeService, TransportTypeMapper transportTypeMapper) {
        this.transportTypeService = transportTypeService;
        this.transportTypeMapper = transportTypeMapper;
    }


    @GetMapping("/transporttype/{id}")
    public TransportTypeDTO findOneById(@PathVariable Long id) {
        return transportTypeMapper.toDTO(transportTypeService.findOneById(id));
    }
}
