package com.learning.spring_security_complete.service;


import com.learning.spring_security_complete.Entity.Users;
import com.learning.spring_security_complete.repo.UserRepo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepo userRepo;
    private BCryptPasswordEncoder bCryptPasswordEncoder;



    public  UserService(UserRepo userRepo , BCryptPasswordEncoder bCryptPasswordEncoder){
        this.userRepo = userRepo;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public Users registerUser(Users users){
        users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        return  userRepo.save(users);

    }
}
