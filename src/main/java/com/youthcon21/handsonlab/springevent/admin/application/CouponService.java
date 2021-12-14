package com.youthcon21.handsonlab.springevent.admin.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CouponService {
    public void register(String email) {
        log.info("쿠폰 등록 완료 : {}", email);
    }
}
