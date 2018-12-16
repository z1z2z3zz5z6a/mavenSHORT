package com.itheima.domain;

public class Items {
    private Integer id;
    private String name;
    private Double price;
    private String detail;

    public Items() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String toString() {
        return "Items{id=" + this.id + ", name='" + this.name + '\'' + ", price=" + this.price + ", detail='" + this.detail + '\'' + '}';
    }
}
