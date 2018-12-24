package com.blob.service.util;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/18 20:21
 */
public class DateUtil {
    public static Integer getYearMonth(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);//设置时间
        int year = cal.get(Calendar.YEAR);//获取年份
        int month=cal.get(Calendar.MONTH) + 1;//获取月份
        return year*100+month;//返回年份乘以100加上月份的值，因为月份最多2位数，所以年份乘以100可以获取一个唯一的年月数值
    }

    public static boolean isYearMonthSame(Date date1,Date date2){
        if(getYearMonth(date1).equals(getYearMonth(date2))){
            return true;
        }else{
            return false;
        }
    }
}
