package com.lockedme.models;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UserRegistration {

    private String uname;
    private String password;

    public UserRegistration() {
    }

    public UserRegistration(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "UserRegistration{" +
                "uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
