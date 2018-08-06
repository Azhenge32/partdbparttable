package com.azhen.shardingjdbclearn.mapper;

import com.azhen.shardingjdbclearn.entity.UserEntity;

import java.util.List;

public interface User1Mapper {
    List<UserEntity> getAll();

    void insert(UserEntity user);
}
