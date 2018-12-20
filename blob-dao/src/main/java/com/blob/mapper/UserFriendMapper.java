package com.blob.mapper;

import com.blob.entity.UserFriend;

public interface UserFriendMapper {
    int deleteByPrimaryKey(Long userFriendId);

    int insert(UserFriend record);

    int insertSelective(UserFriend record);

    UserFriend selectByPrimaryKey(Long userFriendId);

    int updateByPrimaryKeySelective(UserFriend record);

    int updateByPrimaryKey(UserFriend record);
}