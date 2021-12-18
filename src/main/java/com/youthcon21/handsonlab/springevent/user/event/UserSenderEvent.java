package com.youthcon21.handsonlab.springevent.user.event;

import org.springframework.context.ApplicationEvent;

public class UserSenderEvent{
    private final String email;
    private final String phoneNumber;

    public UserSenderEvent(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
