package com.zyk.springjpa.service.impl;

import com.zyk.springjpa.entity.UserEntity;
import com.zyk.springjpa.mapper.UserRepository;
import com.zyk.springjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void Save(UserEntity user) {
        long count = userRepository.count();
        System.out.println(count);
        userRepository.save(user);
    }
}
