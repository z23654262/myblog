package com.blob.service;

import com.blob.entity.Category;

import java.util.List;

public interface CategoryService {
    /***
    * @Author zhangshuaifei
    * @Description 通过类别的名字来查与之相关的博客信息
    * @Date 20:04 2018-12-17
    * @Param [name]
    * @return java.util.List<com.blob.entity.Category>
    **/
    public List<Category> getCategoryBlobs(String name);

    /***
    * @Author zhangshuaifei
    * @Description 获取所有类别信息
    * @Date 21:15 2018-12-19
    * @Param []
    * @return java.util.List<com.blob.entity.Category>
    **/
    public List<Category> getAllCategory();
}
