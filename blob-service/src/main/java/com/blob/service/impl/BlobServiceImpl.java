package com.blob.service.impl;

import com.blob.entity.Blob;
import com.blob.entity.BlobByDate;
import com.blob.mapper.BlobMapper;
import com.blob.service.BlobService;
import com.blob.service.util.DateUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/12 23:06
 */
@Service
public class BlobServiceImpl implements BlobService {
    @Autowired
    private BlobMapper blobMapper;

    @Value("${IndexBlobsPageCount}")
    private Integer INDEX_BLOBS_PAGE_COUNT;

    @Value("${IndexRecommendBlobsCount}")
    private Integer INDEX_RECOMMEND_BLOBS_PAGE_COUNT;

    @Override
    public Blob getBlobById(Long id) {
        return blobMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Blob> getBlobsByName(Integer startPage,String name) {
        PageHelper.startPage(startPage,INDEX_BLOBS_PAGE_COUNT);
        return blobMapper.selectIndexBlobsByName(name);
    }

    @Override
    public List<Blob> getRecommendBlobsByName(Integer startPage, String name) {
        PageHelper.startPage(startPage,INDEX_RECOMMEND_BLOBS_PAGE_COUNT);
        return blobMapper.selectIndexRecommendBlobsByName(name);
    }

    @Override
    public Integer getIndexBlobsCount(String name) {
        Integer result = blobMapper.selectIndexBlobsByName(name).size();
        if(0 == result%INDEX_BLOBS_PAGE_COUNT){
            return result/INDEX_BLOBS_PAGE_COUNT;
        }else{
            return result/INDEX_BLOBS_PAGE_COUNT+1;
        }
    }

    @Override
    public Integer getRecommendBlobsCount(String name) {
        Integer result = blobMapper.selectIndexRecommendBlobsByName(name).size();
        if(0 == result%INDEX_RECOMMEND_BLOBS_PAGE_COUNT){
            return result/INDEX_RECOMMEND_BLOBS_PAGE_COUNT;
        }else{
            return result/INDEX_RECOMMEND_BLOBS_PAGE_COUNT+1;
        }
    }

    @Override
    public Map<String, String> uploadBlobImg(MultipartFile file, HttpServletRequest request) {
        Map<String, String> map = new HashMap<String, String>();
        try {
            //存储文件夹
            String holder = "/img/blob/";
            if (file == null) {
                return null;
            }
            String orgginalFileName = file.getOriginalFilename();
            //新文件名称
            String newFileName = UUID.randomUUID().toString() + orgginalFileName;
            //保存路径
            String serverPath = request.getSession().getServletContext().getRealPath("/") + holder;

            file.transferTo(new File(serverPath, newFileName));

            //返回客户端的JSON
            map.put("success", "true");
            map.put("msg", "成功");
            //返回服务器地址
            map.put("file_path",request.getContextPath() + holder + newFileName);
        } catch (IOException e) {
            e.printStackTrace();
            map.put("success", "false");
        }
        return map;
    }

    @Override
    public Map<String, String> uploadBlobImgs(MultipartFile[] file, HttpServletRequest request) {
        return null;
    }

    @Override
    public Blob getBlobDetailById(Long id) {
        blobMapper.blobAccessIncrease(id);
        Blob blob = blobMapper.selectBlobDetailById(id);
        return blob;
    }

    @Override
    public List<BlobByDate> getBlobsByDate() {
        List<Blob> blobList = blobMapper.selectIndexBlobsByName("%%");

        List<BlobByDate> result = new ArrayList<BlobByDate>();

        int resultCount = 0;

        Blob blob1 = blobList.get(0);

        if(blob1!=null){
            /*将第一个博客的信息填充到第一个博客时间分类实体内*/
            BlobByDate blobByDate = new BlobByDate();
            blobByDate.setBlobDate(blob1.getBlobTime());
            blobByDate.setBlobList(new ArrayList<Blob>());
            blobByDate.getBlobList().add(blob1);
            result.add(blobByDate);

            /*从1开始遍历将博客列表填充到博客时间分类实体内*/
            for (int i=1;i<blobList.size();i++) {

                /*获取当前按时间分类的博客时间分类实体*/
                BlobByDate blobByDateTemp = result.get(resultCount);

                /*获取当前的要加入列表的博客实体*/
                Blob blobTemp = blobList.get(i);

                /*判断要添加的博客实体是否跟博客时间分类实体里面的最新的相等*/
                /*相等继续添加*/
                if(DateUtil.isYearMonthSame(blobByDateTemp.getBlobDate(),blobTemp.getBlobTime())){

                    blobByDateTemp.getBlobList().add(blobTemp);

                }
                /*不相等新生成一个博客时间分类实体*/
                else{
                    resultCount++;
                    BlobByDate blobByDateAnother = new BlobByDate();
                    blobByDateAnother.setBlobDate(blobTemp.getBlobTime());
                    blobByDateAnother.setBlobList(new ArrayList<Blob>());
                    blobByDateAnother.getBlobList().add(blobTemp);
                    result.add(blobByDateAnother);
                }
            }
        }
        return result;
    }

    public List<BlobByDate> getBlobsCountByDate(){
        Blob blob = blobMapper.selectBlobsCountByDate();
        return blob.getBlobByDates();
    }


    @Override
    public BlobByDate getBlobsByYearAndMonth(String time) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
        Date date = null;
        try{
            date = sf.parse(time);
        }catch (Exception e){
            e.printStackTrace();
        }
        BlobByDate blobByDate = new BlobByDate(date,blobMapper.selectBlobsByDate(DateUtil.getYearMonth(date)));
        return blobByDate;
    }

    @Override
    public void insertBlob(Blob blob) {
        blobMapper.insertBlob(blob);
    }
}
