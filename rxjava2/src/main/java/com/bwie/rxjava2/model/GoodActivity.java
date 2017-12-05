package com.bwie.rxjava2.model;

import com.google.gson.Gson;

/**
 * Created by liqy on 2017/12/5.
 */

public class GoodActivity {

    public String id;
    public String goodsSpreeId;
    public String goodsId;
    public String goodsName;
    public String goodsImg;
    public String marketPrice;
    public String activityPrice;
    public String salesRatio;
    public int stockNumber;
    public int releaseNumber;

    @Override
    public String toString() {
        return "GoodActivity{" +
                "id='" + id + '\'' +
                ", goodsSpreeId='" + goodsSpreeId + '\'' +
                ", goodsId='" + goodsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                ", marketPrice=" + marketPrice +
                ", activityPrice=" + activityPrice +
                ", salesRatio=" + salesRatio +
                ", stockNumber=" + stockNumber +
                ", releaseNumber=" + releaseNumber +
                '}';
    }
}
