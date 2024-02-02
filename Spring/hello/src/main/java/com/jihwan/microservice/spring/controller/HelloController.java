package com.jihwan.microservice.spring.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {
  @GetMapping("/hello")
  public String sayHello() {
    return "Hello World!";
  }

  @GetMapping("/helloTo")
  public String sayHelloTo(@RequestParam String name) {
    return "Hello " + name;
  }
  @GetMapping("/hello/{name}")
  public String sayHelloPath(@PathVariable String name) {
    return "Hello " + name;
  }
}
