package com.example.lodgify;

public class User {
    public String username;
    public String userphone;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String userphone) {
        this.username = username;
        this.userphone = userphone;
    }
}
