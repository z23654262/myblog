package com.blob.mapper;

import com.blob.entity.BlobTag;

public interface BlobTagMapper {
    int deleteByPrimaryKey(Long tagId);

    int insert(BlobTag record);

    int insertSelective(BlobTag record);

    BlobTag selectByPrimaryKey(Long tagId);

    int updateByPrimaryKeySelective(BlobTag record);

    int updateByPrimaryKey(BlobTag record);
}