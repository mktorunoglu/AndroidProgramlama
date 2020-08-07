package com.example.myapplication;

import io.realm.RealmObject;

public class KisilerTablosu extends RealmObject {

    private String isim;
    private String soyisim;
    private Integer yas;
    private Integer maas;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "KisilerTablosu{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", maas=" + maas +
                '}';
    }
}
