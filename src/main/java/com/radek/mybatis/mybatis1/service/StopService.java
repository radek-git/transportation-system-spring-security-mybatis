package com.radek.mybatis.mybatis1.service;

import com.radek.mybatis.mybatis1.entity.Stop;
import com.radek.mybatis.mybatis1.entity.StopLine;
import com.radek.mybatis.mybatis1.repository.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopService {

    private StopRepository stopRepository;

    @Autowired
    public StopService(StopRepository stopRepository) {
        this.stopRepository = stopRepository;
    }

    public List<Stop> findAll() {
        return stopRepository.findAll();
    }


    public Stop findById(Long id) {
        return stopRepository.findById(id).orElseThrow(() -> new RuntimeException("nie ma"));
    }

    public Stop findByName(String stopName) {
        return stopRepository.findByName(stopName).orElseThrow(() -> new RuntimeException("Nie ma takiego przystanku"));
    }
}
