package com.blob.listener;

import com.blob.util.LoginUserMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/23 20:37
 */
public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        String sessionId = session.getId();
        //移除loginUsers中已经被销毁的session
        LoginUserMap.removeUser(sessionId);
    }
}
