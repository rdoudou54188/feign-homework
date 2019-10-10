package com.mingyin.serviceA;

import myfirst.Api;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController2 implements Api {

    @Override
    public String getName(String name) {
        return name;
    }
}
