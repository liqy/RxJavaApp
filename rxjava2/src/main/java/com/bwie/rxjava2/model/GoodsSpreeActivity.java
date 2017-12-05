package com.bwie.rxjava2.model;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by liqy on 2017/12/5.
 */

public class GoodsSpreeActivity {

    public String id;
    public String name;
    public String startDate;
    public String endDate;
    public String status;
    public String startSeconds;
    public String endSeconds;
    public String isChecked;

    public List<GoodActivity> goodsList;

    @Override
    public String toString() {
        return "GoodsSpreeActivity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", status='" + status + '\'' +
                ", startSeconds='" + startSeconds + '\'' +
                ", endSeconds='" + endSeconds + '\'' +
                ", isChecked='" + isChecked + '\'' +
                ", goodsList=" + goodsList +
                '}';
    }
}
