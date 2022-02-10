package com.example.demo.Pojo;

public class yjh {
    private int id;
    private String name;
    private String sex;
    private String likenam;

    public yjh() {
    }


    public yjh(int id, String name, String sex, String likenam) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.likenam = likenam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLikenam() {
        return likenam;
    }

    public void setLikenam(String likenam) {
        this.likenam = likenam;
    }

    @Override
    public String toString() {
        return "yjh{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", likenam='" + likenam + '\'' +
                '}';
    }
}
