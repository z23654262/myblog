package com.blob.entity;

import java.util.List;

public class Category {
    private Long categoryId;

    private String categoryDetail;

    private List<Blob> blobList;

    private Integer blobCount;

    public Integer getBlobCount() {
        return blobCount;
    }

    public void setBlobCount(Integer blobCount) {
        this.blobCount = blobCount;
    }

    public List<Blob> getBlobList() {
        return blobList;
    }

    public void setBlobList(List<Blob> blobList) {
        this.blobList = blobList;
    }

    public Category(Long categoryId, String categoryDetail) {
        this.categoryId = categoryId;
        this.categoryDetail = categoryDetail;
    }

    public Category() {
        super();
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(String categoryDetail) {
        this.categoryDetail = categoryDetail == null ? null : categoryDetail.trim();
    }
}