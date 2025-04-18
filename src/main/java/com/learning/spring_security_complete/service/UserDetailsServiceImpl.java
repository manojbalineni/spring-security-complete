package com.learning.spring_security_complete.service;

import com.learning.spring_security_complete.Entity.Users;
import com.learning.spring_security_complete.repo.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepo userRepo;
    public UserDetailsServiceImpl(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByName(username);
        if(user == null){
            System.out.println("User Not Found");
            throw  new UsernameNotFoundException("User Not Found");
        }
        return new UserPrincipal(user);
    }
}
