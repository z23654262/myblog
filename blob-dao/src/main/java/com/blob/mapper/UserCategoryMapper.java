package com.blob.mapper;

import com.blob.entity.UserCategory;

public interface UserCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserCategory record);

    int insertSelective(UserCategory record);

    UserCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserCategory record);

    int updateByPrimaryKey(UserCategory record);
}