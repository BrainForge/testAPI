package com.testres.rest.service;

import com.testres.rest.entity.TestTable;
import com.testres.rest.repository.TestRepository;
import com.testres.rest.response.APIResponse;
import com.testres.rest.response.APIResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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

    public List<String> getTermometr() throws IOException, InterruptedException {

        Process p = Runtime.getRuntime().exec("ls /home");
        p.waitFor();

        BufferedReader reader =
                new BufferedReader(new InputStreamReader(p.getInputStream()));

        List<String> list = new ArrayList<>();
        String line = "";
        while ((line = reader.readLine())!= null) {
            list.add(line);
        }

        return list;

    }
}
