package com.example.lenovo.lijingqian_2018_3_6.app;

import android.app.Application;

import com.example.lenovo.lijingqian_2018_3_6.inters.Inters;
import com.facebook.drawee.backends.pipeline.Fresco;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lenovo on 2018/3/6.
 */

//fresco初始化
public class MyApp  extends Application{

    public static Inters inters;
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        //https://www.zhaoapi.cn/ad/getAd

       //retrofit请求数据
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.zhaoapi.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        inters = retrofit.create(Inters.class);
    }
}
