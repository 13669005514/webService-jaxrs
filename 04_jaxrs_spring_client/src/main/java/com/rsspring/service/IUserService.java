package com.rsspring.service;


import com.rsspring.enity.User;

import javax.ws.rs.*;
import java.util.List;

@Path("/userService")
@Produces("*/*")
public interface IUserService {

    @POST
    @Path("/user")
    @Consumes({"applcation/xml","application/json"})
    public void saveUser(User user);

    @PUT
    @Path("/user")
    @Consumes({"applcation/xml","application/json"})
    public void  updateUser(User user);

    @DELETE
    @Path("/user")
    @Consumes({"applcation/xml","application/json"})
    public void  deleteUser(User user);

    @GET
    @Path("/user")
    @Consumes({"applcation/xml","application/json"})
    @Produces({"application/json"})
    public List<User> selectUser();

}
