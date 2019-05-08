package com.radek.mybatis.mybatis1.controller;

import com.radek.mybatis.mybatis1.dto.DriverDTO;
import com.radek.mybatis.mybatis1.entity.Driver;
import com.radek.mybatis.mybatis1.mapper.DriverMapper;
import com.radek.mybatis.mybatis1.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DriverController {

    private DriverService driverService;
    private DriverMapper driverMapper;

    @Autowired
    public DriverController(DriverService driverService, DriverMapper driverMapper) {
        this.driverService = driverService;
        this.driverMapper = driverMapper;
    }

    @GetMapping("/drivers")
    public List<DriverDTO> findAll() {
        return driverMapper.toDTO(driverService.findAll());
    }


    @GetMapping("/drivers/id/{id}")
    public DriverDTO findById(@PathVariable Long id) {
        return driverMapper.toDTO(driverService.findById(id));
    }

//    @GetMapping("/drivers/{pesel}")
//    public Driver findByPesel(@PathVariable String pesel) {
//        return driverService.findByPesel(pesel);
//    }

    @GetMapping("/drivers/{surname}")
    public DriverDTO findBySurname(@PathVariable String surname) {
        return driverMapper.toDTO(driverService.findBySurname(surname));
    }
}
