package com.bwie.rxjava2.model.net;

import com.bwie.rxjava2.model.HomeData;
import com.bwie.rxjava2.model.ShopResponse;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by liqy on 2017/12/5.
 */

public interface ShopApi {

    @GET("{token}")
    public Flowable<ShopResponse<HomeData>> homepage(@Path("token") String token, @Query("uri") String uri);

}
