package com.radek.mybatis.mybatis1.service;

import com.radek.mybatis.mybatis1.entity.Line;
import com.radek.mybatis.mybatis1.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineService {

    private LineRepository lineRepository;

    @Autowired
    public LineService(LineRepository lineRepository) {
        this.lineRepository = lineRepository;
    }

    public List<Line> findAll() {
        return lineRepository.findAll();
    }

    public Line findById(Long id) {
        return lineRepository.findById(id).orElseThrow(() -> new RuntimeException("nie ma"));
    }
}
