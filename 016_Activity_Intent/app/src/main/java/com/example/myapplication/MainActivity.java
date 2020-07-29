package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        butonTiklama();
    }

    public void tanimla(){
        btn = (Button) findViewById(R.id.button);
    }

    public void gecisYap(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void butonTiklama(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gecisYap();
            }
        });
    }
}