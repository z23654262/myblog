package com.blob.controller;

import com.blob.entity.User;
import com.blob.service.BlobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/12 23:14
 */
@Controller
public class PageController {
    @Autowired
    private BlobService blobService;

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String toIndex(){
        return "index";
    }

    @RequestMapping(value = "writeBlob",method = RequestMethod.GET)
    public String toWriteBlob(){
        return "blob/writeBlob";
    }

    /***
     * @Author zhangshuaifei
     * @Description 跳转到博客详情界面 由ajax来填充数据
     * @Date 20:59 2018-12-16
     * @Param
     * @return
     **/
    @RequestMapping(value = "blobDetail/{id}",method = RequestMethod.GET)
    public String toBlobDetail(@PathVariable("id") Long id){
        return "blob/blobDetail";
    }

    /***
    * @Author zhangshuaifei
    * @Description 跳转选择类别界面
    * @Date 22:13 2018-12-17
    * @Param []
    * @return java.lang.String
    **/
    @RequestMapping(value = "chooseCategory",method = RequestMethod.GET)
    public String toChooseCategory(){
      return "category/chooseCategory";
    }

    /***
    * @Author zhangshuaifei
    * @Description 跳转到类别详情界面
    * @Date 22:55 2018-12-17
    * @Param [name]
    * @return java.lang.String
    **/
    @RequestMapping(value = "categoryDetail/{name}",method = RequestMethod.GET)
    public String toCategoryDetail(@PathVariable("name") String name){
        return "category/categoryDetail";
    }

    /***
    * @Author zhangshuaifei
    * @Description 按时间归档博客
    * @Date 22:42 2018-12-18
    * @Param []
    * @return java.lang.String
    **/
    @RequestMapping(value = "archivesByDate",method = RequestMethod.GET)
    public String toArchivesByDate(){
        return "blob/archiveBlobByDate";
    }

    /***
    * @Author zhangshuaifei
    * @Description 关于网站界面
    * @Date 11:47 2018-12-19
    * @Param
    * @return
    **/
    @RequestMapping(value = "aboutSite",method = RequestMethod.GET)
    public String toAboutSite(){
        return "system/aboutSite";
    }

    /***
    * @Author zhangshuaifei
    * @Description 跳转到登录界面
    * @Date 12:57 2018-12-22
    * @Param []
    * @return java.lang.String
    **/
    @RequestMapping(value = "toLogin",method = RequestMethod.GET)
    public String toLogin(){
        return "system/login";
    }
}
