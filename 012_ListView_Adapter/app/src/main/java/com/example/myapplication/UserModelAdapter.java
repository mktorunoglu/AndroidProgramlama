package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class UserModelAdapter extends BaseAdapter {
    List<UserModel> list;
    Context context;

    public UserModelAdapter(List<UserModel> list, Context context){
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View layout = LayoutInflater.from(context).inflate(R.layout.user_layout, viewGroup, false);

        TextView ad = layout.findViewById(R.id.name);
        TextView soyad = layout.findViewById(R.id.surname);
        TextView yas = layout.findViewById(R.id.age);
        TextView is = layout.findViewById(R.id.job);

        ad.setText(list.get(position).getName());
        soyad.setText(list.get(position).getSurname());
        yas.setText(list.get(position).getAge());
        is.setText(list.get(position).getJob());

        return layout;
    }
}
