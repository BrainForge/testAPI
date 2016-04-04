package com.testres.rest.repository;

import com.testres.rest.entity.ThermometerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Anton Afanasyeu on 17.03.16.
 */
public interface ThermometerRepository extends JpaRepository<ThermometerEntity, Integer> {
    List<ThermometerEntity> findAll();
}