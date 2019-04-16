package com.in28minutes.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// GET
// URI - /hello-world
// method - "Hello world"
@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    // hello-world-bean
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    // hello-world/path-variable/in28minutes
    @RequestMapping(method = RequestMethod.GET, path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorld(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
