package com.blob.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/23 20:35
 */
public class LoginUserMap {
    private static Map<Long, String> loginUsers = new ConcurrentHashMap<Long, String>();

    /**
     * 将用户和sessionId存入map
     * @param key
     * @param value
     */
    public static void setLoginUsers(Long loginId, String sessionId) {
        loginUsers.put(loginId, sessionId);
    }

    /**
     * 获取loginUsers
     * @return
     */
    public static Map<Long, String> getLoginUsers() {
        return loginUsers;
    }

    /**
     * 根据sessionId移除map中的值
     * @param sessionId
     */
    public static void removeUser(String sessionId) {
        for (Map.Entry<Long, String> entry : loginUsers.entrySet()) {
            if (sessionId.equals(entry.getValue())) {
                loginUsers.remove(entry.getKey());
                break;
            }
        }
    }

    /**
     * 判断用户是否在loginusers中
     * @param loginId
     * @param sessionId
     * @return
     */
    public static boolean isInLoginUsers(Long loginId, String sessionId) {
        return (loginUsers.containsKey(loginId) && sessionId.equals(loginUsers.get(loginId)));
    }
}
