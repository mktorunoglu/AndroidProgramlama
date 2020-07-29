package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DegerAl extends AppCompatActivity {
    String kAdi, kParola, kCinsiyet;
    TextView t_kAdi, t_kParola, t_kCinsiyet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deger_al);

        tanimla();
        veriAl();
        goruntule();
    }

    public void tanimla(){
        t_kAdi = findViewById(R.id.t_kAdi);
        t_kParola = findViewById(R.id.t_kParola);
        t_kCinsiyet = findViewById(R.id.t_kCinsiyet);
    }

    public void veriAl(){
        Bundle intent = getIntent().getExtras();
        kAdi = intent.getString("intentKullaniciAdi");
        kParola = intent.getString("intentParola");
        kCinsiyet = intent.getString("intentCinsiyet");
    }

    public void goruntule(){
        t_kAdi.setText(kAdi);
        t_kParola.setText(kParola);
        t_kCinsiyet.setText(kCinsiyet);
    }
}