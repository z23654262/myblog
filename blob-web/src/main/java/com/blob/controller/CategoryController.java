package com.blob.controller;

import com.blob.entity.Category;
import com.blob.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/17 20:05
 */
@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "getCategoryDetail",method = RequestMethod.POST)
    @ResponseBody
    public List<Category> getCategoryDetail(@RequestParam(value = "name",required = true) String name){
        return  categoryService.getCategoryBlobs(name);
    }

    @RequestMapping(value = "getAllCategory",method = RequestMethod.POST)
    @ResponseBody
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

}
