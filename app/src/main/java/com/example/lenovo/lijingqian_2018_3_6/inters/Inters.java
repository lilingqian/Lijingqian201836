package com.example.lenovo.lijingqian_2018_3_6.inters;

import com.example.lenovo.lijingqian_2018_3_6.bean.BannerBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by lenovo on 2018/3/6.
 */

public interface Inters {
    //https://www.zhaoapi.cn/ad/getAd
    @GET("ad/getAd")
    Observable<BannerBean> getBanner();

    //@GET()

}
