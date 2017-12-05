package com.bwie.rxjava2.model;

import com.google.gson.Gson;

/**
 * Created by liqy on 2017/12/5.
 */

public class ActivityInfo {

    public String id;
    public String activityImg;
    public String activityType;
    public String activityData;
    public String activityDataDetail;
    public String activityAreaDisplay;
    public String countDownEnable;
    public String remark;
    public int sort;

    @Override
    public String toString() {
        return "ActivityInfo{" +
                "id='" + id + '\'' +
                ", activityImg='" + activityImg + '\'' +
                ", activityType='" + activityType + '\'' +
                ", activityData='" + activityData + '\'' +
                ", activityDataDetail='" + activityDataDetail + '\'' +
                ", activityAreaDisplay='" + activityAreaDisplay + '\'' +
                ", countDownEnable='" + countDownEnable + '\'' +
                ", remark='" + remark + '\'' +
                ", sort=" + sort +
                '}';
    }
}
