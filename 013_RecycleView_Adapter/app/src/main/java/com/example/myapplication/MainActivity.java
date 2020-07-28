package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<MesajModel> list;
    RecyclerView rv;
    RecyclerView.LayoutManager layoutManager;
    MesajAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        listeDoldur();
    }

    public void tanimla(){
        rv = (RecyclerView) findViewById(R.id.recycleView);
        layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
    }

    public void listeDoldur(){
        list = new ArrayList<>();

        MesajModel m1 = new MesajModel("Murat", "Merhaba", R.drawable.kisi1);
        MesajModel m2 = new MesajModel("Tarık", "Hayır", R.drawable.kisi2);
        MesajModel m3 = new MesajModel("Selin", "Tamam", R.drawable.kisi3);
        MesajModel m4 = new MesajModel("Murat", "Merhaba", R.drawable.kisi1);
        MesajModel m5 = new MesajModel("Tarık", "Hayır", R.drawable.kisi2);
        MesajModel m6 = new MesajModel("Selin", "Tamam", R.drawable.kisi3);
        MesajModel m7 = new MesajModel("Murat", "Merhaba", R.drawable.kisi1);
        MesajModel m8 = new MesajModel("Tarık", "Hayır", R.drawable.kisi2);
        MesajModel m9 = new MesajModel("Selin", "Tamam", R.drawable.kisi3);

        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);
        list.add(m6);
        list.add(m7);
        list.add(m8);
        list.add(m9);

        adapter = new MesajAdapter(this, list);
        rv.setAdapter(adapter);
    }
}