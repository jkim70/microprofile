package com.jihwan.microservice.tomee.jpadb.controller;

import com.jihwan.microservice.tomee.jpadb.model.User;
import com.jihwan.microservice.tomee.jpadb.service.UserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/api")
public class UserController {
  @Inject
  private UserService userService;
  @GET
  @Path("/user/{id}")
  public String getUser(@PathParam("id") Long id){
    return userService.getUserById(id);
  }
}
