package com.blob.mapper;

import com.blob.entity.BlobTag;

public interface BlobTagMapper {
    int deleteByPrimaryKey(Long tagId);

    int insert(BlobTag record);

    int insertSelective(BlobTag record);

    BlobTag selectByPrimaryKey(Long tagId);

    int updateByPrimaryKeySelective(BlobTag record);

    int updateByPrimaryKey(BlobTag record);

    /***
    * @Author zhangshuaifei
    * @Description 添加博客标签信息(单个)
    * @Date 15:35 2018-12-23
    * @Param
    * @return
    **/
    void insertBlobTag(BlobTag blobTag);
}