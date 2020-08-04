package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class KisilerAdapter extends BaseAdapter{
    List<Kisiler> list;
    Context context;

    public KisilerAdapter(List<Kisiler> list, Context context) {
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
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.kisiler_layout, parent, false);

        TextView kullaniciAdi = convertView.findViewById(R.id.username_tv);
        TextView parola = convertView.findViewById(R.id.password_tv);
        TextView cinsiyet = convertView.findViewById(R.id.gender_tv);

        kullaniciAdi.setText(list.get(position).getKullaniciAdi());
        parola.setText(list.get(position).getParola());
        cinsiyet.setText(list.get(position).getCinsiyet());

        return convertView;
    }
}
