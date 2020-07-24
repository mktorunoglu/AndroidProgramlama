package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tikla();
    }

    public void tanimla(){
        img = (ImageView) findViewById(R.id.image);
        btn = (Button) findViewById(R.id.button);
    }

    public void tikla(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int random_sayi = (int)(Math.random()*5+1);
                System.out.println(random_sayi);
                degistir(random_sayi);
            }
        });
    }

    public void degistir(int sayi){
        if(sayi==1){
            img.setImageResource(R.drawable.bir);
            btn.setText(sayi+". resim olarak değiştirildi.");
        }else if(sayi==2){
            img.setImageResource(R.drawable.iki);
            btn.setText(sayi+". resim olarak değiştirildi.");
        }else if(sayi==3){
            img.setImageResource(R.drawable.uc);
            btn.setText(sayi+". resim olarak değiştirildi.");
        }else if(sayi==4){
            img.setImageResource(R.drawable.dort);
            btn.setText(sayi+". resim olarak değiştirildi.");
        }else {
            img.setImageResource(R.drawable.bes);
            btn.setText(sayi+". resim olarak değiştirildi.");
        }
    }
}