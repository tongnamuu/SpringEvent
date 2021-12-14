package com.youthcon21.handsonlab.springevent.user.application;

public class UserRequest {
    private final String name;
    private final String email;
    private final String phoneNumber;

    public UserRequest(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
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
