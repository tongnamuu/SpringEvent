package com.youthcon21.handsonlab.springevent.user.event;

import org.springframework.context.ApplicationEvent;

public class UserCouponEvent extends ApplicationEvent {
    private final String email;

    public UserCouponEvent(Object source, String email) {
        super(source);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
