package com.youthcon21.handsonlab.springevent.sender.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SenderService {
    public void sendSMS(String phoneNumber) {
        log.info("환영 문자 발송 성공 : {}", phoneNumber);
    }

    public void sendEmail(String email) {
        log.info("환영 이메일 발송 성공 : {}", email);
    }
}
