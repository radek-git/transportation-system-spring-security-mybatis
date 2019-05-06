package com.radek.mybatis.mybatis1.service;

import com.radek.mybatis.mybatis1.entity.Driver;
import com.radek.mybatis.mybatis1.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    private DriverRepository driverRepository;

    @Autowired
    public DriverService(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    public List<Driver> findAll() {
        return driverRepository.findAll();
    }

    public Driver findById(Long id) {
        return driverRepository.findById(id).orElseThrow(() -> new RuntimeException("nie ma takiego użytkownika"));
    }

    public Driver findByPesel(String pesel) {
        return driverRepository.findByPesel(pesel).orElseThrow(() -> new RuntimeException("nie ma takiego użytkownika"));
    }

    public Driver findBySurname(String surname) {
        return driverRepository.findBySurname(surname).orElseThrow(() -> new RuntimeException("nie ma takiego użytkownika"));
    }
}
