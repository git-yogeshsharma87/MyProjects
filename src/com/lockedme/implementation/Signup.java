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
    private static Scanner input;

    public static void registrationInput() {
        // Welcome page for new user registration
        System.out.println("*******************************");
        System.out.println("WELCOME TO NEW USER REGISTRATION");
        System.out.println("*******************************");
        System.out.println("Please enter username :");
        users = new UserRegistration();
        String name = keyCred.nextLine();
        boolean isFileCreated = fileCreation(name);
        if(isFileCreated) {
            users.setUname(name);

            System.out.println("Please enter your password :");
            String pass = keyCred.nextLine();
            users.setPassword(pass);
            fileOut.println(users.getUname());
            fileOut.println(users.getPassword());
            System.out.println("File Created Successfully");
            fileOut.close();

        }
    }

    public static boolean fileCreation(String username) {
        String filename = username + ".txt";

        try {
            File userFile = new File(filename);

            if(userFile.createNewFile()) {}
            else {
                System.out.println("File Already exists ! Exiting .. ");
                return false;
            }
            fileOut = new PrintWriter(new FileWriter(userFile,true));
            input = new Scanner(userFile);

            users = new UserRegistration();

        }

        catch (IOException e) {
            System.out.println("Something went wrong ! ");
        }

        return true;

    }
}
