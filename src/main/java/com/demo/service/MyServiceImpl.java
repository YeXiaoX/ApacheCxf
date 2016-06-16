package com.demo.service;

import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ivan on 2016/6/15.
 */
public class MyServiceImpl implements IMyService {

    private HashMap<String, User> users = new HashMap<String,User>();

    public MyServiceImpl(){
        init();
    }

    public Response addUser(User user) {

        users.put(user.getId(), user);
        System.out.println("添加用户成功");
        System.out.println(users.size());
        System.out.println(users.get("2").getName());
        return Response.ok().build();
    }


    public Response delUser(String id) {
        users.remove(id);
        System.out.println(users.size());
        return Response.ok().build();
    }


    public Response updateUser(User user) {
        users.put(user.getId(), user);
        System.out.println(users.get("1").getName());
        return Response.ok().build();
    }


    public User getUserById(Man man) {
        System.out.println("name:"+man.getName());
        System.out.println("id:"+man.getId());
        return users.get(man.getId());
    }



    private void init(){
        User user = new User();
        user.setId("1");
        user.setName("温欢");
        users.put(user.getId(), user);
    }


    public List<User> findAllUsers() {
        List<User> userlist = new ArrayList<User>();
        userlist.add(users.get("1"));
        return userlist;
    }

}