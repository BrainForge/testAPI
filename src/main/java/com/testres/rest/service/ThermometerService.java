package com.testres.rest.service;

import com.testres.rest.entity.ThermometerEntity;
import com.testres.rest.repository.ThermometerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Anton Afanasyeu on 17.03.16.
 */
@Transactional
@Service
public class ThermometerService {

    @Autowired
    ThermometerRepository thermometerRepository;

    public List<ThermometerEntity> getAllThermometr(){
        return thermometerRepository.findAll();
    }
}
