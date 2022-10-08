package com.example.baitapgiuaki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class baihatadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<cacbaihat> cacbaihatList;

    public baihatadapter(Context context, int layout, List<cacbaihat> cacbaihatList) {
        this.context = context;
        this.layout = layout;
        this.cacbaihatList = cacbaihatList;
    }

    @Override
    public int getCount() {
        return cacbaihatList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHoder{
        ImageView imgcasi, imgbacham;
        TextView texttenbaihat, texttencasi;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHoder hoder;
        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            view = inflater.inflate(layout, null);
            hoder = new ViewHoder();

            hoder.texttenbaihat = (TextView) view.findViewById(R.id.tenbaihat_text_listview);
            hoder.texttencasi = (TextView) view.findViewById(R.id.tencasi_text_listview);
            hoder.imgcasi = (ImageView) view.findViewById(R.id.img_img_listview);
            hoder.imgbacham = (ImageView) view.findViewById(R.id.img_bacham_listview);
            view.setTag(hoder);
        }else{
            hoder = (ViewHoder) view.getTag();
        }
        cacbaihat cacbaihat =cacbaihatList.get(i);
        hoder.texttenbaihat.setText(cacbaihat.getTenbaihat());
        hoder.texttencasi.setText(cacbaihat.getTencasi());
        hoder.imgcasi.setImageResource(cacbaihat.getImgcasi());
        hoder.imgbacham.setImageResource(cacbaihat.getImgbacham());
        return view;
    }
}
