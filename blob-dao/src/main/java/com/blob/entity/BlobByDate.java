package com.blob.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

/**
 * @author zhangshuaifei
 * @description
 * @date 2018/12/18 21:06
 */
public class BlobByDate {
    private Date blobDate;

    private List<Blob> blobList;

    @JsonFormat(pattern = "yyyy年MM月")
    public Date getBlobDate() {
        return blobDate;
    }

    public void setBlobDate(Date blobDate) {
        this.blobDate = blobDate;
    }

    public List<Blob> getBlobList() {
        return blobList;
    }

    public void setBlobList(List<Blob> blobList) {
        this.blobList = blobList;
    }

    @Override
    public String toString() {
        return "BlobByDate{" +
                "blobDate=" + blobDate +
                ", blobList=" + blobList +
                '}';
    }
}
