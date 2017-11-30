package com.fanfengping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping(value = { "/", "" }, 
                   method = RequestMethod.GET)
    public String welcome() {
        return "{\"status\":\"Ok\"}";
    }

}
