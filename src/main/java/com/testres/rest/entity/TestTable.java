package com.testres.rest.entity;

import javax.persistence.*;

/**
 * Created by callo_000 on 04.02.2016.
 */
@Entity
@Table(name = "test")
public class TestTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "text")
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
