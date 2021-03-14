package com.example.springcache.domain;

public class SubService {

    private int id;
    private String nameEn;
    private String nameAr;
    private int mainServiceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameAr() {
        return nameAr;
    }

    public void setNameAr(String nameAr) {
        this.nameAr = nameAr;
    }

    public int getMainServiceId() {
        return mainServiceId;
    }

    public void setMainServiceId(int mainServiceId) {
        this.mainServiceId = mainServiceId;
    }
}
