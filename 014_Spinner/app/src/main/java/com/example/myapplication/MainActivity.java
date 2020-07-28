package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String[] IstanbulIlceleri = {"Ümraniye", "Kadıköy", "Ataşehir", "Avcılar", "Arnavutköy", "Şişli"};
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        adapterOlustur();
        spinnerAdaterEkle();
    }

    public void tanimla(){
        spinner = (Spinner) findViewById(R.id.spinner);
    }

    public void adapterOlustur(){
        arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, IstanbulIlceleri);
    }

    public void spinnerAdaterEkle(){
        spinner.setAdapter(arrayAdapter);
    }
}