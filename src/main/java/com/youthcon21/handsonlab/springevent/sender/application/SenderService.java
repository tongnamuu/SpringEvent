package com.youthcon21.handsonlab.springevent.sender.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SenderService {
    private final static Logger log = LoggerFactory.getLogger(SenderService.class);

    public void sendEmail(String email) {
        log.info("환영 이메일 발송 성공 : {}", email);
    }
    public void sendSMS(String email) {
        log.info("환영 이메일 발송 성공 : {}", email);
    }
}
