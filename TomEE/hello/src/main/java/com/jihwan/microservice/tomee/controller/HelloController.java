package com.jihwan.microservice.tomee.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

@Path("/api")
public class HelloController {
  @GET
  @Path("/hello")
  public String sayHello() {
    return "Hello World!";
  }

  @GET
  @Path("/helloTo")
  public String sayHelloTo(@QueryParam("name") String name) {
    return "Hello " + name;
  }
  @GET
  @Path("/hello/{name}")
  public String sayHelloPath(@PathParam("name") String name) {
    return "Hello " + name;
  }
}
