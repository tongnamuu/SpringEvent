package com.youthcon21.handsonlab.springevent.admin.application;

import com.youthcon21.handsonlab.springevent.user.event.UserCouponEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserCouponEventListener {
    private final static Logger log = LoggerFactory.getLogger(UserCouponEventListener.class);
    @EventListener
    public void onApplicationEvent(UserCouponEvent event) {
        log.info("쿠폰 등록 완료 : {}", event.getEmail());
    }
}
