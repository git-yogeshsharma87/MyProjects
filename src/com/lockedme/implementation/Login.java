package com.lockedme.implementation;

import java.util.Scanner;

public class Login {
    private static Scanner lockerFile;

    public static void login() {

        System.out.println("*******************************");
        System.out.println("WELCOME TO LOGIN PAGE");
        System.out.println("*******************************");
        System.out.println("Please enter username :");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Please enter your password :");
        Scanner scanner1 = new Scanner(System.in);
        String password = scanner1.nextLine();    }
		/*System.out.println("Enter Username :");
    String inpUsername = keyboard.next();
    boolean found = false;
		while(input.hasNext() && !found) {
        if(input.next().equals(inpUsername)) {
            System.out.println("Enter Password :");
            String inpPassword = keyboard.next();
            if(input.next().equals(inpPassword)) {
                System.out.println("Login Successful ! 200OK");
                found = true;
                lockerOptions(inpUsername);
                break;
            }
        }
    }
		if(!found) {
        System.out.println("User Not Found : Login Failure : 404");
    }*/

}
