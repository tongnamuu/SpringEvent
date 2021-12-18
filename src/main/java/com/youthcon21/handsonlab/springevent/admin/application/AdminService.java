package com.youthcon21.handsonlab.springevent.admin.application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final static Logger log = LoggerFactory.getLogger(AdminService.class);

    public void alarm(String username) {
        log.info("어드민 서비스 : {}님이 가입했습니다", username);
    }
}
