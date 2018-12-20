package com.blob.entity;

public class UserCategory {
    private Long id;

    private Long userId;

    private Long userCategoryId;

    public UserCategory(Long id, Long userId, Long userCategoryId) {
        this.id = id;
        this.userId = userId;
        this.userCategoryId = userCategoryId;
    }

    public UserCategory() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(Long userCategoryId) {
        this.userCategoryId = userCategoryId;
    }
}