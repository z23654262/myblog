package com.blob.service.impl;

import com.blob.entity.BlobTag;
import com.blob.mapper.BlobTagMapper;
import com.blob.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/23 15:36
 */
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private BlobTagMapper blobTagMapperl;

    @Override
    public void insertTag(String[] tagName, Long blobId) {
        for(String name:tagName){
            BlobTag blobTag = new BlobTag(blobId,name);
            blobTagMapperl.insert(blobTag);
        }
    }
}
