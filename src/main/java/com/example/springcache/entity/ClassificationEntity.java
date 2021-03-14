package com.example.springcache.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classification")
public class ClassificationEntity {
    @Id
    private int id;

    @Column(name="NameEn")
    private String nameEn;

    @Column(name="NameAr")
    private String nameAr;

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

    @Override
    public String toString() {
        return "ClassificationEntity{" +
                "id=" + id +
                ", nameEn='" + nameEn + '\'' +
                ", nameAr='" + nameAr + '\'' +
                '}';
    }
}
