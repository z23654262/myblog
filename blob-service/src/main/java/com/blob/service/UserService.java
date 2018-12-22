package com.blob.service;

import com.blob.entity.User;

public interface UserService {
    /***
    * @Author zhangshuaifei
    * @Description 通過用戶名來查找用戶信息 id username password level
    * @Date 19:50 2018-12-22
    * @Param []
    * @return com.blob.entity.User
    **/
    public User getUserByName(String username);

    /***
    * @Author zhangshuaifei
    * @Description 检查密码是否相等
    * @Date 20:01 2018-12-22
    * @Param [user, password]
    * @return com.blob.entity.User
    **/
    public boolean checkUserPwd(User user,String password);
}
