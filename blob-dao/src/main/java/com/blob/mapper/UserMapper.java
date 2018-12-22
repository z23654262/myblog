package com.blob.mapper;

import com.blob.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /***
    * @Author zhangshuaifei
    * @Description 通過用戶名來查找用戶
    * @Date 19:49 2018-12-22
    * @Param
    * @return
    **/
    User selectUserByName(String username);
}