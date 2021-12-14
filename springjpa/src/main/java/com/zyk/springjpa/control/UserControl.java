package com.zyk.springjpa.control;

import com.zyk.springjpa.entity.UserEntity;
import com.zyk.springjpa.mapper.UserRepository;
import com.zyk.springjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserControl {
    @Autowired
    private  UserService userService;

    @Autowired
    private UserRepository userRepository;



    @GetMapping("/saveUser")
    public void saveUser(){
        UserEntity user= new UserEntity();
        user.setEmail("@");
        user.setUsername("123");
        user.setPassword("1231231");
        userRepository.save(user);
        System.out.println(112);
    }


    void getById(){
    }



}

