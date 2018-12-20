package com.blob.entity;

public class BlobTag {
    private Long tagId;

    private Long blobId;

    private String tagDetail;

    public BlobTag(Long tagId, Long blobId, String tagDetail) {
        this.tagId = tagId;
        this.blobId = blobId;
        this.tagDetail = tagDetail;
    }

    public BlobTag() {
        super();
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getBlobId() {
        return blobId;
    }

    public void setBlobId(Long blobId) {
        this.blobId = blobId;
    }

    public String getTagDetail() {
        return tagDetail;
    }

    public void setTagDetail(String tagDetail) {
        this.tagDetail = tagDetail == null ? null : tagDetail.trim();
    }
}