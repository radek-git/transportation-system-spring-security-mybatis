package com.radek.mybatis.mybatis1.service;

import com.radek.mybatis.mybatis1.entity.Vehicle;
import com.radek.mybatis.mybatis1.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    private VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    public Vehicle findById(Long id) {
        return vehicleRepository.findById(id).orElseThrow(() -> new RuntimeException("nie ma takiego pojazdu"));
    }
}
