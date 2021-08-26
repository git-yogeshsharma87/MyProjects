package com.lockedme.models;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UserRegistration {

    String email;
    String password;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRegistration() {
    }

    public UserRegistration(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static void registrationInput(){
        System.out.println("*******************************");
        System.out.println("WELCOME TO NEW USER REGISTRATION");
        System.out.println("*******************************");
        System.out.println("Please enter username :");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String filename = username +".txt";
        System.out.println("Please enter your password :");
        Scanner scanner1 = new Scanner(System.in);
        String password = scanner1.nextLine();
        createFile(filename);
    }

    //create a file using File class
    private static void createFile(String filename){

        File file = new File(filename);
        try {
            if(file.createNewFile()){
                System.out.println(" Registration is complete !");
            } else {
                System.out.println(" User already exist ! ");
            }
        } catch (IOException e) {
            System.out.println(" Registration Failed !");
                    }

    }

}
