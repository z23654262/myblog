package com.blob.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class Blob {
    private Long blobId;

    private String blobTitle;

    private String blobSummary;

    private Date blobTime;

    private Long blobCategoryId;

    private Integer istop;

    private Long userId;

    private String blobDetail;

    private Integer blobAccess;

    private Category category;

    private List<Comment> commentList;

    private List<BlobTag> blobTagList;

    public List<BlobTag> getBlobTagList() {
        return blobTagList;
    }

    public void setBlobTagList(List<BlobTag> blobTagList) {
        this.blobTagList = blobTagList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public Integer getBlobAccess() {
        return blobAccess;
    }

    public void setBlobAccess(Integer blobAccess) {
        this.blobAccess = blobAccess;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Blob(Long blobId, String blobTitle, String blobSummary, Date blobTime, Long blobCategoryId, Integer istop, Long userId, String blobDetail) {
        this.blobId = blobId;
        this.blobTitle = blobTitle;
        this.blobSummary = blobSummary;
        this.blobTime = blobTime;
        this.blobCategoryId = blobCategoryId;
        this.istop = istop;
        this.userId = userId;
        this.blobDetail = blobDetail;
    }

    @Override
    public String toString() {
        return "Blob{" +
                "blobTitle='" + blobTitle + '\'' +
                ", blobTime=" + blobTime +
                '}';
    }

    public Blob() {
        super();
    }

    public Long getBlobId() {
        return blobId;
    }

    public void setBlobId(Long blobId) {
        this.blobId = blobId;
    }

    public String getBlobTitle() {
        return blobTitle;
    }

    public void setBlobTitle(String blobTitle) {
        this.blobTitle = blobTitle == null ? null : blobTitle.trim();
    }

    public String getBlobSummary() {
        return blobSummary;
    }

    public void setBlobSummary(String blobSummary) {
        this.blobSummary = blobSummary == null ? null : blobSummary.trim();
    }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getBlobTime() {
        return blobTime;
    }

    public void setBlobTime(Date blobTime) {
        this.blobTime = blobTime;
    }

    public Long getBlobCategoryId() {
        return blobCategoryId;
    }

    public void setBlobCategoryId(Long blobCategoryId) {
        this.blobCategoryId = blobCategoryId;
    }

    public Integer getIstop() {
        return istop;
    }

    public void setIstop(Integer istop) {
        this.istop = istop;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBlobDetail() {
        return blobDetail;
    }

    public void setBlobDetail(String blobDetail) {
        this.blobDetail = blobDetail == null ? null : blobDetail.trim();
    }
}