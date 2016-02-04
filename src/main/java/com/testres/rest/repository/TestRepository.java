package com.testres.rest.repository;

import com.testres.rest.entity.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by callo_000 on 04.02.2016.
 */
public interface TestRepository extends JpaRepository<TestTable, Integer> {
    List<TestTable> findAll();
}
