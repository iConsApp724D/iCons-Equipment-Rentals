package com.example.icons724dv2.Model;

public class Users {
    private String Password, Username;
    private boolean Online;

    public Users()
    {

    }

    public Users(String password, String username) {
        Password = password;
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }
}
