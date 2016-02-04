package com.testres.rest.service;

import com.testres.rest.entity.TestTable;
import com.testres.rest.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by callo_000 on 04.02.2016.
 */
@Service
@Transactional
public class TestTableService {
    @Autowired
    private TestRepository testRepository;

    public List<TestTable> getAll() {
        List<TestTable> test = testRepository.findAll();
        return test;
    }
}
