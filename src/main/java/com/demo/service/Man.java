package com.demo.service;

import javax.ws.rs.HeaderParam;

/**
 * Created by Ivan on 2016/6/15.
 */
public class Man {
    @HeaderParam("name")
    private String name;

    @HeaderParam("id")
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
