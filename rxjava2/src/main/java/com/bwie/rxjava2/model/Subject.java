package com.bwie.rxjava2.model;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by liqy on 2017/12/5.
 */

public class Subject {

    public String id;
    public String title;
    public String detail;
    public String image;
    public String start_time;
    public String end_time;
    public int show_number;
    public String state;
    public int sort;
    public String descImage;
    public String template;
    public String url;
    public String wapUrl;

    public List<Good> goodsList;
    public List<String> goodsIdsList;
    public List<GoodRelation> goodsRelationList;

    @Override
    public String toString() {
        return "Subject{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", detail='" + detail + '\'' +
                ", image='" + image + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", show_number=" + show_number +
                ", state='" + state + '\'' +
                ", sort=" + sort +
                ", descImage='" + descImage + '\'' +
                ", template='" + template + '\'' +
                ", url='" + url + '\'' +
                ", wapUrl='" + wapUrl + '\'' +
                ", goodsList=" + goodsList +
                ", goodsIdsList=" + goodsIdsList +
                ", goodsRelationList=" + goodsRelationList +
                '}';
    }
}
