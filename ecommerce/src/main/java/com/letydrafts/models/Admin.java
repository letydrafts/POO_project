package com.letydrafts.models;

public class Admin extends User{
    
    public Admin(String username, String email) {
        super(username, email);
    }

    public void addProduct(String name, double price, Integer suply) {
        Product p = new Product(name, price, suply);
        System.out.println("Product added: " + p);
    }

    public void removeProduct(Product p) {
        if (p == null) {
            System.out.println("Product not found.");
            return;
        }
        System.out.println("Product removed: " + p);
    }
    
}
