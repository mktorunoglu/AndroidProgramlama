package com.example.myapplication;

public class MesajModel {
    private String isim, mesaj;
    private int resimID;

    public MesajModel(String isim, String mesaj, int resimID) {
        this.isim = isim;
        this.mesaj = mesaj;
        this.resimID = resimID;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public int getResimID() {
        return resimID;
    }

    public void setResimID(int resimID) {
        this.resimID = resimID;
    }
}
