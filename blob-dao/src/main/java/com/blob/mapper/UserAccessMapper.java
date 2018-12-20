package com.blob.mapper;

import com.blob.entity.UserAccess;

public interface UserAccessMapper {
    int deleteByPrimaryKey(Long accessId);

    int insert(UserAccess record);

    int insertSelective(UserAccess record);

    UserAccess selectByPrimaryKey(Long accessId);

    int updateByPrimaryKeySelective(UserAccess record);

    int updateByPrimaryKey(UserAccess record);
}