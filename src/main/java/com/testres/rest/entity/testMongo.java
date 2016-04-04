package com.testres.rest.entity;

import org.springframework.data.annotation.Id;

/**
 * Created by Anton Afanasyeu on 04.04.16.
 */
public class testMongo {

    @Id
    private String id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
