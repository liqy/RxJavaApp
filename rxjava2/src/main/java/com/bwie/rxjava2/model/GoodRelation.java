package com.bwie.rxjava2.model;

import com.google.gson.Gson;

/**
 * Created by liqy on 2017/12/5.
 */

public class GoodRelation {

    /**
     * id : 14815
     * subject_id : 84
     * goods_id : 492
     * goodsName : PG one热荐：★★★★★
     * goodsImage : https://image.yunifang.com/yunifang/images/goods/temp/171011192212214258195254179.jpg
     * description : 三重植物精粹，三重水润膜力，美时美刻，水润透亮~
     */

    public String id;
    public String subject_id;
    public String goods_id;
    public String goodsName;
    public String goodsImage;
    public String description;

    public static GoodRelation objectFromData(String str) {

        return new Gson().fromJson(str, GoodRelation.class);
    }

    @Override
    public String toString() {
        return "GoodRelation{" +
                "id='" + id + '\'' +
                ", subject_id='" + subject_id + '\'' +
                ", goods_id='" + goods_id + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsImage='" + goodsImage + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
