package com.emailapp;

import java.util.Scanner;

import lombok.ToString;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // constructor to recieve the first and last
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        // call a method asking for dept which returns the department
        this.department = setDepartment();
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

    // set mailbox capacity

    // change the password

    // displaying the email
    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.department;
    }
}
