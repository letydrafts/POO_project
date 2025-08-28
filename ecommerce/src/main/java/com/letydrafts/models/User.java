package com.letydrafts.models;

public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User:" + this.username + ", Email" + this.email;
                
    }  
}
