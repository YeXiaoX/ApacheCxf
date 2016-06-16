package com.demo.service;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Ivan on 2016/6/15.
 */
@Path("/userservice/")
public interface IMyService {

    @Path("/addUser/")
    @POST
    Response addUser(User user);

    @Path("/delUser/{id}/")
    @DELETE
    Response delUser(@PathParam("id") String id);

    @Path("/updateUser/")
    @PUT
    Response updateUser(User user);

    @Path("/getUserById/{id}/")
    @GET
    @Produces("application/xml")//返回json数据格式
    User getUserById(@BeanParam Man man);//@HeaderParam("id") String id,@HeaderParam("name") String name);

    @Path("/")
    @GET
    @Produces("application/json")//返回json数据格式
    List<User> findAllUsers();
}
