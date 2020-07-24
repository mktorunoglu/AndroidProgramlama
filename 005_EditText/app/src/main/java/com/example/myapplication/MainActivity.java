package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button btn;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        tikla();
    }

    private void tanimla() {
        et = (EditText)findViewById(R.id.text);
        btn = (Button)findViewById(R.id.hesapla);
        tv = (TextView)findViewById(R.id.sonuc);
    }

    private void tikla() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String deger = et.getText().toString();
                int faktoriyel = Integer.parseInt(deger);
                int sonuc = hesapla(faktoriyel);

                tv.setText("Sonuç = " + sonuc);
            }
        });
    }

    private int hesapla(int sayi) {
        int sonuc = 1;
        for(int i = sayi; i > 1; i-- ){
            sonuc = sonuc * i;
        }
        return sonuc;
    }

}