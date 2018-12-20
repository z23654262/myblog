package com.test;

import com.blob.service.util.DateUtil;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/18 20:09
 */
public class TestCase2 {
    @Test
    public void test(){
        System.out.println(DateUtil.isYearMonthSame(new Date(),new Date()));
    }

}
