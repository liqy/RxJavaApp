package com.bwie.rxjava2.model;

import java.util.List;

/**
 * Created by liqy on 2017/12/5.
 */

public class ActivityInfoDisplay {
    public String activityAreaDisplay;
    public List<ActivityInfo> activityInfoList;

    @Override
    public String toString() {
        return "ActivityInfoDisplay{" +
                "activityAreaDisplay='" + activityAreaDisplay + '\'' +
                ", activityInfoList=" + activityInfoList +
                '}';
    }
}
