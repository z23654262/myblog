package com.blob.service.impl;

import com.blob.entity.Category;
import com.blob.mapper.CategoryMapper;
import com.blob.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/17 20:04
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getCategoryBlobs(String name) {
        return categoryMapper.selectCategoryAndBlobs(name);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryMapper.selectAllCategory();
    }

}
