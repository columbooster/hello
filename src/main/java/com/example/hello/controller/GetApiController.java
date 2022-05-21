package com.example.hello.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") // http://localhost:9090/api/get/hello
    public String hello(){
        return "get Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get http://localhost:9090/api/get/hi
    public String hi(){
        return "hi";
    }

    // http://localhost:9090/api/get/path-variable/{name}

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName){
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

     //search?q = intellij
    // &rlz = 1C1CHZN_koKR959KR959
    // &oq = intelli
    // &aqs = chrome.0.0i433i512j69i57j0i512l2j0i433i512j0i512l5.1950j0j15
    // &sourceid = chrome
    // &ie = UTF-8

    // ?key=value&key2=value2

    // http:localhost:9090/api/get/query-param?user=steve&email=steve@gmail.com&age=30


}
