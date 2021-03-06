package com.lockedme.implementation;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Login {
    private static Scanner keyboard;
    private static Scanner input;


    public static boolean login() {

        //read data from keyboard
        keyboard = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("WELCOME TO LOGIN PAGE");
        System.out.println("*******************************");
        System.out.println("Please enter username :");
        String inpUsername = keyboard.next();
        File dbFile = new File(inpUsername+".txt");
        try {
            //read data from db file
            input = new Scanner(dbFile);
        } catch (IOException e) {
            System.out.println("User doesn't exist !");
            return false;
        }
        boolean found = false;
        while (input.hasNext()) {
            if (input.next().equals(inpUsername)) {
                System.out.println("Enter Password :");
                String inpPassword = keyboard.next();
                if (input.next().equals(inpPassword)) {
                    System.out.println("Login Successful ! Redirecting to options ..");
                    found = true;
                    Locker.lockerOptions(inpUsername);
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Wrong credentials : Login Failure : 404");
        }

        return true;
    }

}