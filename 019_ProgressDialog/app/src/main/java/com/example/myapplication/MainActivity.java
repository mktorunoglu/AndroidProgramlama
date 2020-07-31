package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openDialog();
    }

    public void openDialog(){
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("İçerik yükleniyor...");
        progressDialog.setMessage("İçerik 5 saniye sonra yüklenecektir. Lütfen bekleyiniz.");
        progressDialog.setCancelable(false);
        progressDialog.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                progressDialog.cancel();
            }
        }).start();
    }
}