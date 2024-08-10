package com.vv.autowired_final.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleService {
    public String getMessage() {
        return "Hello, Spring!";
    }
}
