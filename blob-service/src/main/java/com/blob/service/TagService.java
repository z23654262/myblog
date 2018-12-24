package com.blob.service;

public interface TagService {
    /***
    * @Author zhangshuaifei
    * @Description 插入博客标签信息
    * @Date 15:38 2018-12-23
    * @Param []
    * @return void
    **/
    public void insertTag(String[] tagName,Long blobId);
}
