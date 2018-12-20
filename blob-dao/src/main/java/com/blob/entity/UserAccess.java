package com.blob.entity;

public class UserAccess {
    private Long accessId;

    private Integer accessIsshare;

    private Integer accessIsgood;

    private Long userId;

    private Long blobId;

    public UserAccess(Long accessId, Integer accessIsshare, Integer accessIsgood, Long userId, Long blobId) {
        this.accessId = accessId;
        this.accessIsshare = accessIsshare;
        this.accessIsgood = accessIsgood;
        this.userId = userId;
        this.blobId = blobId;
    }

    public UserAccess() {
        super();
    }

    public Long getAccessId() {
        return accessId;
    }

    public void setAccessId(Long accessId) {
        this.accessId = accessId;
    }

    public Integer getAccessIsshare() {
        return accessIsshare;
    }

    public void setAccessIsshare(Integer accessIsshare) {
        this.accessIsshare = accessIsshare;
    }

    public Integer getAccessIsgood() {
        return accessIsgood;
    }

    public void setAccessIsgood(Integer accessIsgood) {
        this.accessIsgood = accessIsgood;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBlobId() {
        return blobId;
    }

    public void setBlobId(Long blobId) {
        this.blobId = blobId;
    }
}