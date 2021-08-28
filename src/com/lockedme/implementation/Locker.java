package com.lockedme.implementation;

import com.lockedme.models.UserAccounts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Locker {
    private static Scanner keyboard;
    private static Scanner lockerInput;
    //output data
    private static PrintWriter lockerOutput;
    //model to store data.
    private static UserAccounts userAccounts;

    public static void lockerOptions(String inpUsername) {
        initApp(inpUsername);
        //read data from keyboard
        keyboard = new Scanner(System.in);
        System.out.println("1 . FETCH ALL STORED CREDENTIALS ");
        System.out.println("2 . STORE CREDENTIALS ");
        System.out.println("3 . DELETE CREDENTIALS ");
        System.out.println("4 . DELETE YOUR ACCOUNT ");

        int option = keyboard.nextInt();
        switch (option) {
            case 1:
                fetchCredentials(inpUsername);
                break;
            case 2:
                storeCredentials(inpUsername);
                break;
            case 3:
                deleteCredentials(inpUsername);
                break;
            case 4:
                deleteAll(inpUsername);
                break;
            default:
                System.out.println("Please select between 1 to 4");
                break;
        }
        lockerInput.close();
    }


    private static void deleteAll(String inpUsername) {
        System.out.println("Are you sure you want to delete your account ? Enter Y for yes ");
        keyboard = new Scanner(System.in);
        String consent = keyboard.next();
        if (consent.equalsIgnoreCase("Y")) {
            File fileDel = new File(inpUsername + ".txt");
            File fileDel1 = new File(inpUsername + "Cred.txt");

            if (fileDel.delete() && fileDel1.delete()) {
                System.out.println("Your login is now deleted");
            } else {
                System.out.println("Deletion Failed, please try again ! ");
            }
        } else {
            System.out.println("You haven't approved deletion ! Congrats and continue using lockme.com");

        }
    }

        private static void deleteCredentials (String inpUsername){
            System.out.println("Are you sure you want to delete all your credentials ? Enter Y for yes");
            keyboard = new Scanner(System.in);
            String consent = keyboard.next();
            if (consent.equalsIgnoreCase("Y")) {
                File fileDel = new File(inpUsername + "Cred.txt");
                if (fileDel.delete()) {
                    System.out.println("Your credentials are now deleted");
                } else {
                    System.out.println("Deletion Failed, please try again ! ");
                }
            } else {
                System.out.println("You haven't approved deletion ! Your credentials are still safely stored");
            }
        }

        //store credentials
        public static void storeCredentials (String loggedInUser){
            System.out.println("==========================================");
            System.out.println("*					*");
            System.out.println("*   WELCOME TO DIGITAL LOCKER STORE YOUR CREDS HERE	 *");
            System.out.println("*					*");
            System.out.println("==========================================");
            userAccounts = new UserAccounts();
            userAccounts.setLoggedInUser(loggedInUser);

            System.out.println("Enter Site Name :");
            String siteName = keyboard.next();
            userAccounts.setSiteName(siteName);

            System.out.println("Enter Username :");
            String username = keyboard.next();
            userAccounts.setUsername(username);

            System.out.println("Enter Password :");
            String password = keyboard.next();
            userAccounts.setPassword(password);

            lockerOutput.println(userAccounts.getLoggedInUser());
            lockerOutput.println(userAccounts.getSiteName());
            lockerOutput.println(userAccounts.getUsername());
            lockerOutput.println(userAccounts.getPassword());

            System.out.println("YOUR CREDS ARE STORED AND SECURED!");
            lockerOutput.close();
        }

        //fetch credentials
        public static void fetchCredentials (String inpUsername){
            System.out.println("==========================================");
            System.out.println("*					*");
            System.out.println("*   WELCOME TO DIGITAL LOCKER 	 *");
            System.out.println("*   YOUR CREDS ARE 	 *");
            System.out.println("*					*");
            System.out.println("==========================================");
            System.out.println(inpUsername);


            while (lockerInput.hasNext()) {
                if (lockerInput.next().equals(inpUsername)) {
                    System.out.println("Site Name: " + lockerInput.next());
                    System.out.println("User Name: " + lockerInput.next());
                    System.out.println("User Password: " + lockerInput.next());
                }
            }

        }
        public static void initApp (String inpUsername){
            String filename = inpUsername + "Cred" + ".txt";


            try {
                File lockerFile = new File(filename);


                //out put
                lockerOutput = new PrintWriter(new FileWriter(lockerFile, true));


                //read data from locker file
                lockerInput = new Scanner(lockerFile);
            } catch (IOException e) {
                System.out.println("404 : File Not Found ");
            }

        }
    }

