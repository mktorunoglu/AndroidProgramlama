package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    // build.gradle (Project: ) ve build.gradle (Module: app) kısmına Realm Database işlemleri için eklemeler yapılır.
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        realmTanimla();
        tabloyaEkle();
        logGoster();
    }

    public void realmTanimla(){
        realm = Realm.getDefaultInstance(); // opens "myrealm.realm"
    }

    public void tabloyaEkle(){
        realm.beginTransaction();
        KisilerTablosu kisilerTablosu = realm.createObject(KisilerTablosu.class);
        kisilerTablosu.setIsim("Mehmet Kamil");
        kisilerTablosu.setSoyisim("Torunoğlu");
        kisilerTablosu.setYas(21);
        kisilerTablosu.setMaas(3300);
        realm.commitTransaction();
    }

    public void logGoster(){
        realm.beginTransaction();
        RealmResults<KisilerTablosu> sonuc = realm.where(KisilerTablosu.class).findAll();
        for(KisilerTablosu k : sonuc){
            Log.i("Çıktı: ", k.toString());
        }
        realm.commitTransaction();
    }
}