package com.youthcon21.handsonlab.springevent.sender.application;

import com.youthcon21.handsonlab.springevent.user.event.UserSenderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SenderEventListener implements ApplicationListener<UserSenderEvent> {
    private final static Logger log = LoggerFactory.getLogger(SenderEventListener.class);

    @Override
    public void onApplicationEvent(UserSenderEvent event) {
        log.info("환영 이메일 발송 성공 : {}", event.getEmail());
        log.info("환영 SMS 발송 성공 : {}", event.getPhoneNumber());
    }
}
