package com.bwie.rxjava2.model;

import com.google.gson.Gson;

/**
 * Created by liqy on 2017/12/5.
 */

public class Good {


    public String id;
    public String goods_name;
    public String shop_price;
    public String market_price;
    public String goods_img;
    public boolean reservable;
    public String efficacy;
    public int stock_number;
    public int restrict_purchase_num;
    public String goodsName;
    public String goodsImage;
    public String description;

    /*
    结合
     */
    public GoodRelation relation;


}
