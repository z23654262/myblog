package com.blob.service;

import com.blob.entity.Blob;
import javax.servlet.http.HttpServletRequest;

import com.blob.entity.BlobByDate;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface BlobService {
    /***
    * @Author zhangshuaifei
    * @Description 通过博客id来获取博客信息
    * @Date 22:49 2018-12-13
    * @Param [id]
    * @return com.blob.entity.Blob
    **/
    public Blob getBlobById(Long id);

    /***
    * @Author zhangshuaifei
    * @Description 通过名字来模糊查找首页博客的信息(分页)按时间从新到旧
    * @Date 22:51 2018-12-13
    * @Param [name]
    * @return java.util.List<com.blob.entity.Blob>
    **/
    public List<Blob> getBlobsByName(Integer startPage,String name);

    /***
    * @Author zhangshuaifei
    * @Description 根据博客名字来查询首页所有博客页数
    * @Date 22:59 2018-12-14
    * @Param [name]
    * @return java.lang.Integer
    **/
    public Integer getIndexBlobsCount(String name);

    /***
    * @Author zhangshuaifei
    * @Description 查询推荐博客的信息(分页查询)
    * @Date 13:16 2018-12-14
    * @Param [startPage, name]
    * @return java.util.List<com.blob.entity.Blob>
    **/
    public List<Blob> getRecommendBlobsByName(Integer startPage,String name);

    /***
    * @Author zhangshuaifei
    * @Description 通过博客名字来查找博客数量  访问量不为0
    * @Date 23:00 2018-12-14
    * @Param [name]
    * @return java.lang.Integer
    **/
    public Integer getRecommendBlobsCount(String name);

    /***
    * @Author zhangshuaifei
    * @Description 上传图片
    * @Date 16:44 2018-12-16
    * @Param []
    * @return java.util.Map<java.lang.String,java.lang.String>
    **/
    public Map<String,String> uploadBlobImg(MultipartFile file, HttpServletRequest request);

    /***
     * @Author zhangshuaifei
     * @Description 上传图片
     * @Date 16:44 2018-12-16
     * @Param []
     * @return java.util.Map<java.lang.String,java.lang.String>
     **/
    public Map<String,String> uploadBlobImgs(MultipartFile[] file, HttpServletRequest request);

    /***
    * @Author zhangshuaifei
    * @Description 通过id来查询博客信息
    * @Date 21:38 2018-12-16
    * @Param
    * @return
    **/
    public Blob getBlobDetailById(Long id);

    /***
    * @Author zhangshuaifei
    * @Description 通过日期来给文章分类
    * @Date 20:16 2018-12-18
    * @Param []
    * @return java.util.List<com.blob.entity.BlobByDate>
    **/
    public List<BlobByDate> getBlobsByDate();

    /***
     * @Author zhangshuaifei
     * @Description 查询每一个月的博客数量
     * @Date 16:36 2018-12-20
     * @Param []
     * @return java.util.List<com.blob.entity.BlobByDate>
     **/
    public List<BlobByDate> getBlobsCountByDate();

    /***
    * @Author zhangshuaifei
    * @Description 按一年的某一月来获取该月份内所有博客信息
    * @Date 15:41 2018-12-20
    * @Param [date]
    * @return java.util.List<com.blob.entity.Blob>
    **/
    public BlobByDate getBlobsByYearAndMonth(String time);
}
