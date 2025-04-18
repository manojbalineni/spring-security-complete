package com.learning.spring_security_complete.Controller;


import com.learning.spring_security_complete.Entity.Users;
import com.learning.spring_security_complete.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserService userService;

    public  UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public Users registerUser(@RequestBody Users user){
        return userService.registerUser(user);
    }
}
