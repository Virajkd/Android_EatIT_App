package com.example.zircle.android_eatit_app.Model;

/**
 * Created by zircle on 12/15/2017.
 */

public class User {
    private String name;
    private String phone;
    private String password;

    public User(){}

    public User(String name, String phone, String password){
        this.name = name;
        this.phone = phone;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
