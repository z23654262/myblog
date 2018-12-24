package com.blob.controller;

import com.blob.entity.User;
import com.blob.service.UserService;
import com.blob.util.LoginUserMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/22 16:40
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /***
    * @Author zhangshuaifei
    * @Description 获取登录的用户信息
    * @Date 16:43 2018-12-22
    * @Param [session]
    * @return com.blob.entity.User
    **/
    @RequestMapping(value = "getSessionUser",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> getSessionUser(HttpSession session){
        Map<String,Object> map = new HashMap<>();
        User user = (User) session.getAttribute("user");
        if(user==null){
            map.put("msg","false");
        }else{
            map.put("msg","true");
            map.put("user",user);
        }
        return map;
    }

    /***
     * @Author zhangshuaifei
     * @Description 判断用户账号密码是否正确
     * @Date 16:43 2018-12-22
     * @Param [session]
     * @return com.blob.entity.User
     **/
    @RequestMapping(value = "userLogin",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> userLogin(String username,String password,HttpSession session){
        Map<String,Object> map = new HashMap<>();
        User user = userService.getUserByName(username);
        if(user==null){
            map.put("msg","noExist");
        }else if(!userService.checkUserPwd(user,password)){
            map.put("msg","wrongPassword");
        }else {
            map.put("msg","success");
            map.put("user",user);
            session.setAttribute("user",user);
            LoginUserMap.setLoginUsers(user.getUserId(),session.getId());
        }
        return map;
    }

    /***
    * @Author zhangshuaifei
    * @Description 用户登出
    * @Date 20:12 2018-12-22
    * @Param
    * @return
    **/
    @RequestMapping(value = "userLogout",method = RequestMethod.POST)
    @ResponseBody
    public String userLogout(HttpSession session){
        session.removeAttribute("user");
        return "LogoutSuccess";
    }
}
