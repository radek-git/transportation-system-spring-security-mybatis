package com.radek.mybatis.mybatis1.service;

import com.radek.mybatis.mybatis1.entity.TransportType;
import com.radek.mybatis.mybatis1.repository.TransportTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportTypeService {

    private TransportTypeRepository repository;

    @Autowired
    public TransportTypeService(TransportTypeRepository repository) {
        this.repository = repository;
    }

    public TransportType findOneById(Long id) {
        return repository.findOne(id);
    }
}
