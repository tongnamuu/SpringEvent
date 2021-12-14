package com.youthcon21.handsonlab.springevent.user.application;

public class UserResponse {

    private String name;
    private String email;
    private String phoneNumber;

    public UserResponse(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    UserResponse() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}