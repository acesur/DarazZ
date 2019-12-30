package com.example.darazz.model;

import java.io.Serializable;

public class Item implements Serializable {
    private String name;
    private String qty;
    private String price;
    private String year;

    public Item(String name, String qty, String price, String year) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
