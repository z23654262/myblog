package com.blob.entity;

public class BlobImg {
    private Long imgId;

    private String imgUrl;

    private Long blobId;

    public BlobImg(Long imgId, String imgUrl, Long blobId) {
        this.imgId = imgId;
        this.imgUrl = imgUrl;
        this.blobId = blobId;
    }

    public BlobImg() {
        super();
    }

    public Long getImgId() {
        return imgId;
    }

    public void setImgId(Long imgId) {
        this.imgId = imgId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Long getBlobId() {
        return blobId;
    }

    public void setBlobId(Long blobId) {
        this.blobId = blobId;
    }
}