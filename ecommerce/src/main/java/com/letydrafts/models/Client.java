package com.letydrafts.models;

import java.util.ArrayList;

public class Client extends User{

    private Cart cart;


    public Client(String username, String email) {
        super(username, email);
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Boolean addProductOnCart(Product newProduct) {
       if (newProduct == null)
       return false;

       this.cart.getProducts().add(newProduct);
         return true;
    }

}
