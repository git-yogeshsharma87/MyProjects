package com.lockedme.implementation;

import com.lockedme.models.UserAccounts;
import com.lockedme.models.UserRegistration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Signup {
    private static Scanner keyCred = new Scanner(System.in);
    private static PrintWriter fileOut;
    private static UserRegistration users;

    public static void registrationInput(){
        // Welcome page for new user registration
        System.out.println("*******************************");
        System.out.println("WELCOME TO NEW USER REGISTRATION");
        System.out.println("*******************************");
        System.out.println("Please enter username :");
        users = new UserRegistration();
        String name = keyCred.nextLine();
        users.setUname(name);

        System.out.println("Please enter your password :");
        String pass = keyCred.nextLine();
        users.setPassword(pass);
        fileCreation(name,pass);
        fileOut.println(users.getUname());
        fileOut.println(users.getPassword());
        fileOut.close();
    }

    public static void fileCreation(String username,String password) {
        String filename = username +".txt";
        try {
            File userFile = new File(filename);
            fileOut = new PrintWriter(new FileWriter(userFile,true));

        } catch (IOException e) {
            System.out.println("File Not Found ! ");
        }



    }
}
