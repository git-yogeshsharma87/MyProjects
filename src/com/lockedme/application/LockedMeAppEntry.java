package com.lockedme.application;

import com.lockedme.implementation.Login;
import com.lockedme.implementation.Signup;

import java.util.Scanner;


class LockedMeAppEntry {
    private static final Scanner keyInput = new Scanner(System.in);

    public static void main(String[] args) {

        // call welcome screen
        welcome();

    }

    private static void welcome() {

        // This is the welcome screen of the app

        System.out.println("*******************************");
        System.out.println("WELCOME TO THE LOCK ME APP");
        System.out.println("*******************************");
        System.out.println("Please choose from below options : \n" +
                "1. Enter 1 for Registration\n" +
                "2. Enter 2 for Login");


        int choice = keyInput.nextInt();
        switch (choice) {
            case 1:
                Signup.registrationInput();
                break;
            case 2:
                Login.login();
                break;
            default:
                System.out.println("Not applicable choice ! Retry ");
welcome();        }
        keyInput.close();
    }
}