package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.entity.Driver;
import com.radek.mybatis.mybatis1.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverController {

    private DriverService driverService;

    @Autowired
    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @GetMapping("/drivers")
    public List<Driver> findAll() {
        return driverService.findAll();
    }


    @GetMapping("/drivers/{id}")
    public Driver findById(@PathVariable Long id) {
        return driverService.findById(id);
    }

//    @GetMapping("/drivers/{pesel}")
//    public Driver findByPesel(@PathVariable String pesel) {
//        return driverService.findByPesel(pesel);
//    }

    @GetMapping("/drivers/{surname}")
    public Driver findBySurname(@PathVariable String surname) {
        return driverService.findBySurname(surname);
    }
}
