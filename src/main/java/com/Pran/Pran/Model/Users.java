package com.Pran.Pran.Model;

import org.springframework.stereotype.Component;

@Component
public class Users {

    private String username;
    private String password;


    public Users(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public Users() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
