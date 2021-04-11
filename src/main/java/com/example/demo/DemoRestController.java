package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/")
    public String getHello() {
        return "Hello Aarya!!!";
    }

    @GetMapping("/hello-word")
    public HelloWordBean getHelloWordBean() {
        return new HelloWordBean("Aarya", "aarya@gmail.com");
    }

    @GetMapping("/hello-world/path-variable/{name}")
    public String getHelloWord(@PathVariable String name, @PathVariable String email) {
        return new HelloWordBean(name, email).toString();
    }
}
