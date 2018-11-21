package com.example.bruger.knowwhere;

/**
 * Created by Bruger on 21-11-2018.
 */

public class Member {

    private String username, password;

    public Member(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
