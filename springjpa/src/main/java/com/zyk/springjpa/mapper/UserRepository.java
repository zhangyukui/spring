package com.zyk.springjpa.mapper;


import com.zyk.springjpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface UserRepository<T,ID extends Serializable> extends JpaRepository<UserEntity,Long> {

}
