package com.bwie.rxjava2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.bwie.rxjava2.model.Good;
import com.bwie.rxjava2.model.GoodRelation;
import com.bwie.rxjava2.model.HomeData;
import com.bwie.rxjava2.model.ShopResponse;
import com.bwie.rxjava2.model.Subject;
import com.bwie.rxjava2.model.net.RetrofitHelper;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

import java.nio.channels.FileLock;
import java.util.HashMap;
import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Flowable.just(1, 2, 3)
                .flatMap(new Function<Integer, Publisher<Integer>>() {
                    @Override
                    public Publisher<Integer> apply(Integer integer) throws Exception {
                        return Flowable.range(0, integer);//被观察者
                    }
                }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                Log.d(getLocalClassName(),""+integer);
            }
        });

        Observable.just(1, 2, 3).flatMap(new Function<Integer, ObservableSource<Integer>>() {
            @Override
            public ObservableSource<Integer> apply(Integer integer) throws Exception {
                return Observable.range(0, integer);
            }
        }).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                Log.d(getLocalClassName(),""+integer);
            }
        });

        RetrofitHelper.getShopAPI().homepage(Constants.TOKEN, "homepage")//被观察者
                .doOnSubscribe(new Consumer<Subscription>() {
                    @Override
                    public void accept(Subscription subscription) throws Exception {
                        Log.d(getLocalClassName(), "开始请求数据");
                    }
                })
                .map(new Function<ShopResponse<HomeData>, HomeData>() {
                    @Override
                    public HomeData apply(ShopResponse<HomeData> homeDataShopResponse) throws Exception {
                        List<Subject> subjectList = homeDataShopResponse.data.subjects;
                        HashMap<String, GoodRelation> map;
                        List<GoodRelation> relations;
                        for (Subject sub : subjectList) {
                            map = new HashMap<>();
                            relations = sub.goodsRelationList;
                            for (GoodRelation gr : relations) {
                                map.put(gr.goods_id, gr);
                            }
                            for (Good good : sub.goodsList) {
                                good.relation = map.get(good.id);
                            }
                        }

                        return homeDataShopResponse.data;
                    }
                })
                .subscribeOn(Schedulers.io())//被观察者执行线程
//               Schedulers 线程调度器
                .observeOn(AndroidSchedulers.mainThread())//观察者线程
                .subscribe(new Consumer<HomeData>() {
                    @Override
                    public void accept(HomeData homeData) throws Exception {

                        Log.d(getLocalClassName(), homeData.toString());

                    }
                });

    }
}
