package com.demo.service;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Ivan on 2016/6/15.
 */
@XmlRootElement(name="user")
public class User {

    private String id;
    private String name;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
