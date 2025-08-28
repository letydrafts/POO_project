package com.letydrafts.models;

public class Product {
    private String name;
    private double price;  
    private Integer suply;

    public Product(String name, double price, Integer suply) {
        this.name = name;
        this.price = price;
        this.suply = 0;
    }
    @Override
    public String toString() {
        return this.name + " - " + this.price;
    }
}
