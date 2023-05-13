package com.emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private int defaultPasswordLength = 10;
    private String alternateEmail;

    // constructor to recieve the first and last
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(this.firstName + " " + this.lastName);

        // call a method asking for dept which returns the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call pass method
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);
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
    // set mailbox capacity

    // change the password

    // displaying the email
    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.department;
    }
}
