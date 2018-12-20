package com.blob.entity;

public class Comment {
    private Long commentId;

    private Integer commentIsreply;

    private Long userId;

    private Long blobId;

    private Long replyCommentId;

    private String commentDetail;

    public Comment(Long commentId, Integer commentIsreply, Long userId, Long blobId, Long replyCommentId, String commentDetail) {
        this.commentId = commentId;
        this.commentIsreply = commentIsreply;
        this.userId = userId;
        this.blobId = blobId;
        this.replyCommentId = replyCommentId;
        this.commentDetail = commentDetail;
    }

    public Comment() {
        super();
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentIsreply() {
        return commentIsreply;
    }

    public void setCommentIsreply(Integer commentIsreply) {
        this.commentIsreply = commentIsreply;
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

    public Long getReplyCommentId() {
        return replyCommentId;
    }

    public void setReplyCommentId(Long replyCommentId) {
        this.replyCommentId = replyCommentId;
    }

    public String getCommentDetail() {
        return commentDetail;
    }

    public void setCommentDetail(String commentDetail) {
        this.commentDetail = commentDetail == null ? null : commentDetail.trim();
    }
}