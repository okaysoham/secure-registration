package com.soham.springboot.web.dto;

public class UserRegistrationDto {

    private String firstName;
    private String lastName;
    private String email;
    private String passwrord;

    public UserRegistrationDto(String firstName, String lastName, String email, String passwrord) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passwrord = passwrord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswrord() {
        return passwrord;
    }

    public void setPasswrord(String passwrord) {
        this.passwrord = passwrord;
    }
}
