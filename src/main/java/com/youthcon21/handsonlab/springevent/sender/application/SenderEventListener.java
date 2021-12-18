package com.youthcon21.handsonlab.springevent.sender.application;

import com.youthcon21.handsonlab.springevent.user.event.UserSenderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SenderEventListener {
    private final static Logger log = LoggerFactory.getLogger(SenderEventListener.class);

    @EventListener
    public void handleEmail(UserSenderEvent event) {
        log.info("환영 이메일 발송 성공 : {}", event.getEmail());
    }

    @EventListener
    public void handleSMS(UserSenderEvent event) {
        log.info("환영 SMS 발송 성공 : {}", event.getPhoneNumber());
    }
}
