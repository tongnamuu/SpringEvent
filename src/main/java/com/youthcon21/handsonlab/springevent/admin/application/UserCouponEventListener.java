package com.youthcon21.handsonlab.springevent.admin.application;

import com.youthcon21.handsonlab.springevent.user.event.UserCouponEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class UserCouponEventListener {
    private final static Logger log = LoggerFactory.getLogger(UserCouponEventListener.class);
    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void onApplicationEvent(UserCouponEvent event) {
        log.info("쿠폰 등록 완료 : {}", event.getEmail());
    }
}
