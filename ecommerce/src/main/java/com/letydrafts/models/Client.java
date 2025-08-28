package com.letydrafts.models;

import java.util.ArrayList;

public class Client extends User{

    ArrayList<Product> cart = new ArrayList<>();

    public Client(String username, String email) {
        super(username, email);
        this.cart = new ArrayList<>();
    }

    public Boolean addToCart(Product p) {
        if (p == null)
            return false;
            
        this.cart.add(p);
        return true;
}

    public void listcart(Product p) {
        for (Product product : cart) {
            System.out.println(product);
        }
    }
    
}
