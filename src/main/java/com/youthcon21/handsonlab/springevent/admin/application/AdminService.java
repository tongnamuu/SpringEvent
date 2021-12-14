package com.youthcon21.handsonlab.springevent.admin.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AdminService {
    public void alarm(String username) {
        log.info("어드민 서비스 : 환영합니다 {}", username);
    }
}
