package com.vv.autowired_final.controller;

import com.vv.autowired_final.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @Autowired
    private final SimpleService simpleService;

    // The part below is required to compile 
    //    public SimpleController( final SimpleService simpleService ) {
    //        this.simpleService = simpleService;
    //    }

    @GetMapping( "/hello" )
    public String sayHello() {
        return simpleService.getMessage();
    }
}
