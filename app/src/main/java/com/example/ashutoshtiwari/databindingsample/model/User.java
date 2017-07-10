package com.example.ashutoshtiwari.databindingsample.model;

/**
 * Created by Ashutosh.tiwari on 10/07/17.
 */

public class User {
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
