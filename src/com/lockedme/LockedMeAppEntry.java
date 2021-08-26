package com.lockedme;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

class LockedMeAppEntry {

    public static void main(String[] args) {

        System.out.println("*******************************");
        System.out.println("WELCOME TO THE LOCK ME APP");
        System.out.println("*******************************");
        System.out.println("Please choose from below options : \n" +
                "1. Enter 1 for Registration\n" +
                "2. Enter 2 for Login");

        try {
            Scanner input = new Scanner(System.in);
            int choice = parseInt(input.nextLine());

            if(choice== 1){
                UserRegistration.registrationInput();
            } else if(choice == 2){
                login();
            } else{
                System.out.println("Not applicable choice ! ");
                input.close();
            }
            input.close();
        } catch (NumberFormatException e) {
            System.out.println("Oops, Looks like something went wrong, please try again");

        }

    }

    private static void login() {
        System.out.println("Welcome to Login Page");
    }


}
