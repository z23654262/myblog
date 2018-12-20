package com.blob.entity;

public class UserFriend {
    private Long userFriendId;

    private Long userId;

    private Long friendId;

    public UserFriend(Long userFriendId, Long userId, Long friendId) {
        this.userFriendId = userFriendId;
        this.userId = userId;
        this.friendId = friendId;
    }

    public UserFriend() {
        super();
    }

    public Long getUserFriendId() {
        return userFriendId;
    }

    public void setUserFriendId(Long userFriendId) {
        this.userFriendId = userFriendId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getFriendId() {
        return friendId;
    }

    public void setFriendId(Long friendId) {
        this.friendId = friendId;
    }
}