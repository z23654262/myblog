package com.blob.mapper;

import com.blob.entity.BlobVideo;

public interface BlobVideoMapper {
    int deleteByPrimaryKey(Long videoId);

    int insert(BlobVideo record);

    int insertSelective(BlobVideo record);

    BlobVideo selectByPrimaryKey(Long videoId);

    int updateByPrimaryKeySelective(BlobVideo record);

    int updateByPrimaryKey(BlobVideo record);
}