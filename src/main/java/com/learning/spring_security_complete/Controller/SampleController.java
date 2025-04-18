package com.learning.spring_security_complete.Controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping(value = "/homePage")
    public String greet(HttpServletRequest request){
        return "Hello! Welcome to Spring World : " + request.getSession().getId();
    }
}
