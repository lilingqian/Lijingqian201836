package com.example.lenovo.lijingqian_2018_3_6.Persenter;

import com.example.lenovo.lijingqian_2018_3_6.bean.BannerBean;
import com.example.lenovo.lijingqian_2018_3_6.moder.MyBannerMolder;
import com.example.lenovo.lijingqian_2018_3_6.moder.MyCallBack;
import com.example.lenovo.lijingqian_2018_3_6.view.BannerView;

/**
 * Created by lenovo on 2018/3/6.
 */

public class BannerPersenter {

    BannerView view;
    private final MyBannerMolder molder;

    public BannerPersenter(BannerView view) {
        this.view = view;
        molder = new MyBannerMolder();
    }

    public void getData() {
        molder.get(new MyCallBack() {
            @Override
            public void success(BannerBean bean) {
                if (view != null) {
                    view.success(bean);
                }
            }

            @Override
            public void failuer(String e) {
                if (view != null) {
                    view.failuer(e);
                }
            }
        });
    }

    public void banner() {
        this.view = null;
    }
}
