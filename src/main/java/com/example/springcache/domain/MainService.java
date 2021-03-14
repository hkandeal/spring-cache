package com.example.springcache.domain;

public class MainService {
    private int id;
    private String nameEn;
    private String nameAr;
    private int classficationId;

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

    public int getClassficationId() {
        return classficationId;
    }

    public void setClassficationId(int classficationId) {
        this.classficationId = classficationId;
    }
}
