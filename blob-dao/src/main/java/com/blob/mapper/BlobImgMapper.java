package com.blob.mapper;

import com.blob.entity.BlobImg;

public interface BlobImgMapper {
    int deleteByPrimaryKey(Long imgId);

    int insert(BlobImg record);

    int insertSelective(BlobImg record);

    BlobImg selectByPrimaryKey(Long imgId);

    int updateByPrimaryKeySelective(BlobImg record);

    int updateByPrimaryKey(BlobImg record);
}