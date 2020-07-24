package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        goster("Mehmet Kamil");
    }

    private void tanimla() {
        tv = (TextView)findViewById(R.id.text1);
    }

    private void goster(String kullaniciAdi) {
        tv.setText(kullaniciAdi);
    }

}