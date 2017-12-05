package com.bwie.rxjava2.model;

import java.util.List;

/**
 * Created by liqy on 2017/12/5.
 */

public class HomeData {
    public boolean creditRecived;

    public List<Subject> subjects;

    public ActivityInfoDisplay activityInfo;

    public List<AD> ad1;
    public List<AD> ad5;
    public List<AD> ad8;

    public List<Good> defaultGoodsList;

    public GoodsSpreeActivity goodsSpreeActivity;


    @Override
    public String toString() {
        return "HomeData{" +
                "creditRecived=" + creditRecived +
                '}';
    }
}
