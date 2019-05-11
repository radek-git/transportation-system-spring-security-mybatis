package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.dto.VehicleDTO;
import com.radek.mybatis.mybatis1.entity.Vehicle;
import com.radek.mybatis.mybatis1.mapper.VehicleMapper;
import com.radek.mybatis.mybatis1.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {

    private VehicleService vehicleService;
    private VehicleMapper vehicleMapper;


    @Autowired
    public VehicleController(VehicleService vehicleService, VehicleMapper vehicleMapper) {
        this.vehicleService = vehicleService;
        this.vehicleMapper = vehicleMapper;
    }



    @GetMapping("/vehicles")
    public List<VehicleDTO> findAll() {
        return vehicleMapper.toDTO(vehicleService.findAll());
    }

    @GetMapping("/vehicles/{id}")
    public VehicleDTO findById(@PathVariable Long id) {
        return vehicleMapper.toDTO(vehicleService.findById(id));
    }
}
