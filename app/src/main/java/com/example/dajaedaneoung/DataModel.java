package com.example.dajaedaneoung;

public class DataModel {

    int image_path;
    String cata;

    public int getImage_path() {
        return image_path;
    }

    public void setImage_path(int image_path) {
        this.image_path = image_path;
    }

    public String getCata() {
        return cata;
    }

    public void setCata(String cata) {
        this.cata = cata;
    }

    public DataModel(int image_path, String cata) {
        this.image_path = image_path;
        this.cata = cata;
    }
}
