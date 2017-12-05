package com.bwie.rxjava2.model;

import com.google.gson.Gson;

/**
 * Created by liqy on 2017/12/5.
 */

public class AD {


    public String id;
    public String createtime;
    public String lastupdatetime;
    public String image;
    public int ad_type;
    public int sort;
    public int position;
    public int enabled;
    public String createuser;
    public String lastupdateuser;
    public String ad_type_dynamic;
    public String ad_type_dynamic_data;
    public String ad_type_dynamic_detail;
    public String title;
    public String channelType;

    @Override
    public String toString() {
        return "AD{" +
                "id='" + id + '\'' +
                ", createtime='" + createtime + '\'' +
                ", lastupdatetime='" + lastupdatetime + '\'' +
                ", image='" + image + '\'' +
                ", ad_type=" + ad_type +
                ", sort=" + sort +
                ", position=" + position +
                ", enabled=" + enabled +
                ", createuser='" + createuser + '\'' +
                ", lastupdateuser='" + lastupdateuser + '\'' +
                ", ad_type_dynamic='" + ad_type_dynamic + '\'' +
                ", ad_type_dynamic_data='" + ad_type_dynamic_data + '\'' +
                ", ad_type_dynamic_detail='" + ad_type_dynamic_detail + '\'' +
                ", title='" + title + '\'' +
                ", channelType='" + channelType + '\'' +
                '}';
    }
}
