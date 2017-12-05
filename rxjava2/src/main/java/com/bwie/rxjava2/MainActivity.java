package com.bwie.rxjava2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.bwie.rxjava2.model.HomeData;
import com.bwie.rxjava2.model.ShopResponse;
import com.bwie.rxjava2.model.net.RetrofitHelper;
import com.bwie.rxjava2.model.net.ShopApi;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitHelper.getShopAPI().homepage(Constants.TOKEN,"homepage")//被观察者
                .subscribeOn(Schedulers.io())//被观察者执行线程
//               Schedulers 线程调度器
                .observeOn(AndroidSchedulers.mainThread())//观察者线程
                .subscribe(new Consumer<ShopResponse<HomeData>>() {//观察者
                    @Override
                    public void accept(ShopResponse<HomeData> homeDataShopResponse) throws Exception {
                        Log.d(getLocalClassName(),homeDataShopResponse.toString());
                    }
                });

    }
}
