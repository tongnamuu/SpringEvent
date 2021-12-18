package com.youthcon21.handsonlab.springevent.admin.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CouponService {
    private final static Logger log = LoggerFactory.getLogger(AdminService.class);
    public void register(String email) {
        log.info("쿠폰 등록 완료 : {}", email);
    }
}
