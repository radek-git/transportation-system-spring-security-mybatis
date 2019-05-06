package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.entity.Vehicle;
import com.radek.mybatis.mybatis1.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VehicleController {

    private VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping("/vehicles")
    public List<Vehicle> findAll() {
        return vehicleService.findAll();
    }

    @GetMapping("/vehicles/{id}")
    public Vehicle findById(@PathVariable Long id) {
        return vehicleService.findById(id);
    }
}
