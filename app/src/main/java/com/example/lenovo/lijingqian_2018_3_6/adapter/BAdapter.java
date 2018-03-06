package com.example.lenovo.lijingqian_2018_3_6.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lenovo.lijingqian_2018_3_6.R;
import com.example.lenovo.lijingqian_2018_3_6.bean.BannerBean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 2018/3/6.
 */

public class BAdapter extends  RecyclerView.Adapter<BAdapter.MyViewHolder> {

    List<BannerBean.MiaoshaBean.ListBeanX> list;
    Context context;

    public BAdapter(List<BannerBean.MiaoshaBean.ListBeanX> list, Context context) {
        this.context = context;
        this.list = list;
    }


    @Override
    public BAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_henghua, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BAdapter.MyViewHolder holder, int position) {
        String[] split = list.get(position).getImages().split("\\|");
        holder.sim.setImageURI(Uri.parse(split[0]));
        holder.price.setText(list.get(position).getPrice() + "");
        holder.youhui.setText(list.get(position).getBargainPrice() + "");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.sim)
        SimpleDraweeView sim;
        @BindView(R.id.price)
        TextView price;
        @BindView(R.id.youhui)
        TextView youhui;

        public MyViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}
