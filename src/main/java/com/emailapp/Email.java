package com.emailapp;

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
    }
    // ask for dept

    // generate a random password

    // set mailbox capacity

    // change the password

    // displaying the email
    @Override
    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
