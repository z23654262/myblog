package com.test;

import com.blob.entity.Blob;
import com.blob.entity.BlobByDate;
import com.blob.mapper.BlobMapper;
import com.blob.service.BlobService;
import com.blob.service.util.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/12 23:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring/applicationContext-*.xml")
public class TestCase {
    @Autowired
    private BlobMapper blobMapper;

    @Autowired
    private BlobService blobService;

    @Test
    public void test1(){
        Blob blob = blobMapper.selectByPrimaryKey(2l);
        System.out.println(blob.getBlobSummary());
    }

    @Test
    public void test2(){
        List<Blob> blobs = blobService.getBlobsByName(1, "%%");
        for (Blob blob:blobs){
            System.out.println(blob);
        }
    }

    @Test
    public void test3(){
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
        System.out.println(result.size());
    }
}
