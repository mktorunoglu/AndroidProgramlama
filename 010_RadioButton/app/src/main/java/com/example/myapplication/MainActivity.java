package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton img1, img2, img3, img4, img5;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanimla();
        goster();
    }

    public void tanimla(){
        img1 = (RadioButton) findViewById(R.id.resim1);
        img2 = (RadioButton) findViewById(R.id.resim2);
        img3 = (RadioButton) findViewById(R.id.resim3);
        img4 = (RadioButton) findViewById(R.id.resim4);
        img5 = (RadioButton) findViewById(R.id.resim5);
        iv = (ImageView) findViewById(R.id.image);
    }

    public void goster(){
        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                iv.setImageResource(R.drawable.bir);
                Toast.makeText(getApplicationContext(), img1.getText() + " seçildi.", Toast.LENGTH_SHORT).show();
            }
        });

        img2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                iv.setImageResource(R.drawable.iki);
                Toast.makeText(getApplicationContext(), img2.getText() + " seçildi.", Toast.LENGTH_SHORT).show();
            }
        });

        img3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                iv.setImageResource(R.drawable.uc);
                Toast.makeText(getApplicationContext(), img3.getText() + " seçildi.", Toast.LENGTH_SHORT).show();
            }
        });

        img4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                iv.setImageResource(R.drawable.dort);
                Toast.makeText(getApplicationContext(), img4.getText() + " seçildi.", Toast.LENGTH_SHORT).show();
            }
        });

        img5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                iv.setImageResource(R.drawable.bes);
                Toast.makeText(getApplicationContext(), img5.getText() + " seçildi.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}