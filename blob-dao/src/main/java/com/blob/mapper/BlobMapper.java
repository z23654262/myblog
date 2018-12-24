package com.blob.mapper;

import com.blob.entity.Blob;
import com.blob.entity.BlobByDate;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BlobMapper {
    int deleteByPrimaryKey(Long blobId);

    int insert(Blob record);

    int insertSelective(Blob record);

    Blob selectByPrimaryKey(Long blobId);

    int updateByPrimaryKeySelective(Blob record);

    int updateByPrimaryKeyWithBLOBs(Blob record);

    int updateByPrimaryKey(Blob record);

    /*
    * @Author zhangshuaifei
    * @Description 通过博客名字来查找首页博客的信息
    * @Date 23:49 2018-12-13
    * @Param [name]
    * @return java.util.List<com.blob.entity.Blob>
    **/
    List<Blob> selectIndexBlobsByName(String name);

    /***
    * @Author zhangshuaifei
    * @Description 通过博客标题来查找推荐的博客  先按照访问次数从大到小排序 在按时间从新到旧排序
    * @Date 13:14 2018-12-14
    * @Param [name]
    * @return java.util.List<com.blob.entity.Blob>
    **/
    List<Blob> selectIndexRecommendBlobsByName(String name);

    /***
    * @Author zhangshuaifei
    * @Description 通过id来查询博客信息
    * @Date 21:37 2018-12-16
    * @Param [id]
    * @return java.util.List<com.blob.entity.Blob>
    **/
    Blob selectBlobDetailById(Long id);

    /***
    * @Author zhangshuaifei
    * @Description 博客浏览次数加1
    * @Date 12:44 2018-12-19
    * @Param [blob]
    * @return void
    **/
    void blobAccessIncrease(Long id);

    /***
    * @Author zhangshuaifei
    * @Description 按時間來查詢博客列表(月和年) 仅有id title 和 time
    * @Date 15:34 2018-12-20
    * @Param [date]
    * @return java.util.List<com.blob.entity.Blob>
    **/
    List<Blob> selectBlobsByDate(Integer date);

    /***
    * @Author zhangshuaifei
    * @Description 博客日期以及所对应的博客数量
    * @Date 17:04 2018-12-20
    * @Param []
    * @return com.blob.entity.BlobByDate
    **/
    Blob selectBlobsCountByDate();

    /***
    * @Author zhangshuaifei
    * @Description 写入博客信息
    * @Date 15:10 2018-12-23
    * @Param [blob]
    * @return void
    **/
    void insertBlob(Blob blob);
}