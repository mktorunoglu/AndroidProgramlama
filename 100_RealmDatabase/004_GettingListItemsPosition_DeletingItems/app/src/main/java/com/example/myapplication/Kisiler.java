package com.example.myapplication;

import io.realm.RealmObject;
import io.realm.annotations.RealmClass;

@RealmClass
public class Kisiler extends RealmObject {
    private String kullaniciAdi;
    private String parola;
    private String cinsiyet;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "Kisiler{" +
                "kullaniciAdi='" + kullaniciAdi + '\'' +
                ", parola='" + parola + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }
}
