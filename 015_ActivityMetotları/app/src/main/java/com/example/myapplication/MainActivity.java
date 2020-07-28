package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Takip", "onCreate() metodu çalıştı.");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Takip", "onStart() metodu çalıştı.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("Takip", "onRestart() metodu çalıştı.");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("Takip", "onResume() metodu çalıştı.");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("Takip", "onPause() metodu çalıştı.");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("Takip", "onStop() metodu çalıştı.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("Takip", "onDestroy() metodu çalıştı.");
    }
}