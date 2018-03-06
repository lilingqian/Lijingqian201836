package com.example.lenovo.lijingqian_2018_3_6.moder;

import com.example.lenovo.lijingqian_2018_3_6.bean.BannerBean;

/**
 * Created by lenovo on 2018/3/6.
 */

public interface MyCallBack {
    public void success(BannerBean bean);

    public void failuer(String e);
}
