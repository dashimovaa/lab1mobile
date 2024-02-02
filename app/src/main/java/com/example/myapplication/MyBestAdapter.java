package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyBestAdapter extends BaseAdapter {

    Context context;
    String [] myBestGroupMates;
    LayoutInflater myBestInfater;

    public MyBestAdapter(Context contextt, String[] groupMatess){
        this.context = contextt;
        this.myBestGroupMates = groupMatess;
        this.myBestInfater = LayoutInflater.from(contextt);
    }

    @Override
    public int getCount() {
        return myBestGroupMates.length;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = myBestInfater.inflate(R.layout.activity_group_mate, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(myBestGroupMates[i]);
        textView.setBackgroundColor(Color.GRAY);
        textView.setTextColor(Color.WHITE);
        return view;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
