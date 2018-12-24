package com.blob.interceptor;

import com.blob.entity.User;
import com.blob.util.LoginUserMap;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/23 20:45
 */
public class LoginLimitInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if(user!=null){
            if(!LoginUserMap.isInLoginUsers(user.getUserId(),session.getId())){
                session.removeAttribute("user");
                request.getRequestDispatcher("/toLogin").forward(request,response);
                return false;
            }
            if(request.getRequestURI().contains("toLogin")){
                request.getRequestDispatcher("/index").forward(request,response);
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
