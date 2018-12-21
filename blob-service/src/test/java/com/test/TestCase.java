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
import java.util.Date;
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
        BlobByDate blobsByYearAndMonth = blobService.getBlobsByYearAndMonth("2018-10");
        System.out.println(blobsByYearAndMonth.getBlobDate());
        for (Blob blob:blobsByYearAndMonth.getBlobList()) {
            System.out.println(blob);
        }
    }

    @Test
    public void test4(){
        List<BlobByDate> blobsCountByDate = blobService.getBlobsCountByDate();
        for (BlobByDate blobByDate:blobsCountByDate) {
            System.out.println(blobByDate);
        }
    }

}
