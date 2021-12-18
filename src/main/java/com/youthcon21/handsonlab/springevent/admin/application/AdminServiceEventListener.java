package com.youthcon21.handsonlab.springevent.admin.application;

import com.youthcon21.handsonlab.springevent.user.event.UserAdminEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceEventListener {
    private final static Logger log = LoggerFactory.getLogger(AdminServiceEventListener.class);

    @EventListener
    public void onApplicationEvent(UserAdminEvent event) {
        throw new RuntimeException();
        // log.info("어드민 서비스 : {}님이 가입했습니다", event.getUsername());
    }
}
