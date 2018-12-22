package com.blob.controller;

import com.blob.entity.Blob;
import com.blob.entity.BlobByDate;
import com.blob.service.BlobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/13 22:34
 */
@Controller
public class BlobController {
    @Autowired
    private BlobService blobService;


    /***
    * @Author zhangshuaifei
    * @Description 获取首页所有博客页数
    * @Date 22:55 2018-12-14
    * @Param
    * @return
    **/
    @RequestMapping(value = "queryIndexBlobsCount",method = RequestMethod.POST)
    @ResponseBody
    public Integer getIndexBlobsCount(){
        Integer count = blobService.getIndexBlobsCount("%%");//%%查询全部
        return count;
    }

    /***
    * @Author zhangshuaifei
    * @Description 返回主页的博客内容(可分页)
    * @Date 22:36 2018-12-13
    * @Param []
    * @return java.util.List<com.blob.entity.Blob>
    **/
    @RequestMapping(value = "queryrIndexBlobs",method = RequestMethod.POST)
    @ResponseBody
    public List<Blob> getIndexBlobs(@RequestParam(value = "startPage",required = false,defaultValue = "1") Integer startPage){
        return blobService.getBlobsByName(startPage,"%%");
    }

    /***
     * @Author zhangshuaifei
     * @Description 获取首页所有推荐博客页数
     * @Date 22:55 2018-12-14
     * @Param
     * @return
     **/
    @RequestMapping(value = "queryIndexRecommendBlobsCount",method = RequestMethod.POST)
    @ResponseBody
    public Integer getIndexRecommendBlobsCount(){
        Integer count = blobService.getRecommendBlobsCount("%%");//%%查询全部
        return count;
    }

    /***
     * @Author zhangshuaifei
     * @Description 返回主页的推荐博客内容(可分页)
     * @Date 22:36 2018-12-13
     * @Param []
     * @return java.util.List<com.blob.entity.Blob>
     **/
    @RequestMapping(value = "queryrRecommendIndexBlobs",method = RequestMethod.POST)
    @ResponseBody
    public List<Blob> getIndexRecommendBlobs(@RequestParam(value = "startPage",required = false,defaultValue = "1") Integer startPage){
        return blobService.getRecommendBlobsByName(startPage,"%%");
    }

    /***
    * @Author zhangshuaifei
    * @Description 上传图片
    * @Date 20:59 2018-12-16
    * @Param [photo, request]
    * @return java.util.Map<java.lang.String,java.lang.String>
    **/
    @RequestMapping(value = "blobImgUpload",method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> upload(MultipartFile photo,HttpServletRequest request) throws IllegalStateException, IOException {
        Map<String, String> map = blobService.uploadBlobImg(photo,request);
        return map;
    }

    /***
    * @Author zhangshuaifei
    * @Description 通过ajax来获得博客的详细信息
    * @Date 15:29 2018-12-17
    * @Param
    * @return
    **/
    @RequestMapping(value = "getBlobDetail",method = RequestMethod.POST)
    @ResponseBody
    public Blob getBlobDetail(@RequestParam(name = "blobId",required = true)Long id){
        return blobService.getBlobDetailById(id);
    }


    /***
    * @Author zhangshuaifei
    * @Description 返回按时间归档的博客信息
    * @Date 22:47 2018-12-18
    * @Param []
    * @return java.util.List<com.blob.entity.BlobByDate>
    **/
    @RequestMapping(value = "getArchivesBlobByDate",method = RequestMethod.POST)
    @ResponseBody
    public List<BlobByDate> getArchivesByDate(){
        return blobService.getBlobsByDate();
    }

    /***
    * @Author zhangshuaifei
    * @Description 写博客后跳转到主页
    * @Date 11:28 2018-12-22
    * @Param [blob]
    * @return java.lang.String
    **/
    @RequestMapping(value = "addBlob",method = RequestMethod.POST)
    public String addBlob(Blob blob){
        return "redirect:index";
    }
}
