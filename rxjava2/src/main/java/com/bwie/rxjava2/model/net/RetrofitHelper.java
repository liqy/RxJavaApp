package com.bwie.rxjava2.model.net;

import com.bwie.rxjava2.Constants;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by liqy on 2017/12/5.
 */

public class RetrofitHelper {

    private static OkHttpClient okHttpClient;

    private static ShopApi shopApi;

    static {
        initOkHttpClient();
    }

    /**
     * 初始化 OkHttpClient
     */
    private static void initOkHttpClient() {

        if (okHttpClient == null) {
            synchronized (RetrofitHelper.class) {
                if (okHttpClient == null) {
                    okHttpClient = new OkHttpClient.Builder()
                            .build();
                }
            }
        }

    }

    /**
     * 定义一个泛型方法
     *
     * @param clazz
     * @param url
     * @param <T>
     * @return
     */
    public static <T> T createAPI(Class<T> clazz, String url) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(clazz);
    }

    public static ShopApi getShopAPI() {
        if (shopApi == null) {
            synchronized (RetrofitHelper.class) {
                if (shopApi == null) {
                    shopApi = createAPI(ShopApi.class, Constants.BASE_URL);
                }
            }
        }
        return shopApi;
    }

}
