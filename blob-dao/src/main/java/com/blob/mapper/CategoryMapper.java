package com.blob.mapper;

import com.blob.entity.Category;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Long categoryId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Long categoryId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    /***
    * @Author zhangshuaifei
    * @Description 通过类别的名字来查与之相关的博客信息
    * @Date 20:02 2018-12-17
    * @Param [name]
    * @return java.util.List<com.blob.entity.Category>
    **/
    List<Category> selectCategoryAndBlobs(String name);

    /***
    * @Author zhangshuaifei
    * @Description 查询所有的类别
    * @Date 21:12 2018-12-19
    * @Param
    * @return
    **/
    List<Category> selectAllCategory();

    /***
    * @Author zhangshuaifei
    * @Description 查询所有类别对应的博客数量
    * @Date 16:25 2018-12-23
    * @Param
    * @return
    **/
    List<Category> selectCategoryWithBlobCount();
}