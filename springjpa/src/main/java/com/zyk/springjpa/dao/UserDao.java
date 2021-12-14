package com.zyk.springjpa.dao;

import com.zyk.springjpa.entity.UserEntity;
import com.zyk.springjpa.mapper.UserRepository;

public interface UserDao extends UserRepository<UserEntity,Long> {



}

