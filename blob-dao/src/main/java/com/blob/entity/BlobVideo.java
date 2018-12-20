package com.blob.entity;

public class BlobVideo {
    private Long videoId;

    private String videoUrl;

    private Long blobId;

    public BlobVideo(Long videoId, String videoUrl, Long blobId) {
        this.videoId = videoId;
        this.videoUrl = videoUrl;
        this.blobId = blobId;
    }

    public BlobVideo() {
        super();
    }

    public Long getVideoId() {
        return videoId;
    }

    public void setVideoId(Long videoId) {
        this.videoId = videoId;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public Long getBlobId() {
        return blobId;
    }

    public void setBlobId(Long blobId) {
        this.blobId = blobId;
    }
}