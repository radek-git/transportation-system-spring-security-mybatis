package com.radek.mybatis.mybatis1.service;

import com.radek.mybatis.mybatis1.entity.StopLine;
import com.radek.mybatis.mybatis1.repository.StopLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopScheduleService {

    private StopLineRepository stopLineRepository;

    @Autowired
    public StopScheduleService(StopLineRepository stopLineRepository) {
        this.stopLineRepository = stopLineRepository;
    }

    public List<StopLine> findAll() {
        return stopLineRepository.findAll();
    }
}
