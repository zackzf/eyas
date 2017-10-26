package com.fbart.research.model;

/**
 * Created by wangzhengfa on 2017/8/20.
 */
public class Book {
    private String name;
    private Integer id;
    private String price;

    public Book() {
    }

    public Book(String name, Integer id, String price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
