package com.emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "techcorp.com";

    // constructor to recieve the first and last
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        // call a method asking for dept which returns the department
        this.department = setDepartment();

        // call pass method
        this.password = randomPassword(defaultPasswordLength);

        // combine elements to generate email
        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + "." + companySuffix;

        System.out.println("Your email is: " + email);
    }

    // ask for dept
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for accounting\n0 for none\nEnter Department Code:");

        Scanner input = new Scanner(System.in);
        int departmentChoice = input.nextInt();

        if(departmentChoice == 1){
            return "sales";
        } else if (departmentChoice == 2){
            return "dev";
        } else if (departmentChoice == 3){
            return "acct";
        } else {
            return "";
        }
        
    }
    // generate a random password
    public String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#";
        char[] password = new char[length];
        for (int i = 0; i < password.length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // accessors

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return password;
    }
}
