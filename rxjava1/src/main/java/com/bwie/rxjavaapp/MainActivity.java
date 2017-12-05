package com.bwie.rxjavaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Observable.just("1", "2", "3")
                .subscribe(new Observer<String>() {
                    @Override
                    public void onCompleted() {
                        log("onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        log(e.getMessage());
                    }

                    @Override
                    public void onNext(String s) {
                        log(s);
                    }
                });
        Observable.just("1", "2", "3")

                .subscribe(new Subscriber<String>() {
                    @Override
                    public void onCompleted() {
                        log("onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        log(e.getMessage());
                    }

                    @Override
                    public void onNext(String s) {
                        log(s);
                    }
                });


        Observable.just("1", "1", "3")
                .distinct()
                .map(new Func1<String, String>() {
                    @Override
                    public String call(String s) {
                        return s + "Hello";
                    }
                })
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        log(s);
                    }
                });

        Observable.just("1", "2", "3")
                .map(new Func1<String, Integer>() {//String 输入 Integer输出
                    @Override
                    public Integer call(String s) {
                        return Integer.valueOf(s) + 2;
                    }
                })
                .filter(new Func1<Integer, Boolean>() {
                    @Override
                    public Boolean call(Integer integer) {
                        return integer % 2 == 0;
                    }
                })
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer s) {
                        log(s.toString());
                    }
                });
    }

    private void log(String msg) {
        if (TextUtils.isEmpty(msg)) return;
        Log.d(getLocalClassName(), msg);
    }


}
