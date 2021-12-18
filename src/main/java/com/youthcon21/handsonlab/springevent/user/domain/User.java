package com.youthcon21.handsonlab.springevent.user.domain;

import com.youthcon21.handsonlab.springevent.user.event.UserAdminEvent;
import com.youthcon21.handsonlab.springevent.user.event.UserCouponEvent;
import com.youthcon21.handsonlab.springevent.user.event.UserSenderEvent;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.context.ApplicationEventPublisher;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(unique = true)
    private String email;

    @Column
    private String phoneNumber;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public User(String name, String email, String phoneNumber) {
        this(null, name, email, phoneNumber, null, null);
    }

    private User(Long id, String name, String email, String phoneNumber, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    protected User() {

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void registerEventPublish(ApplicationEventPublisher eventPublisher) {
        adminEventPublish(eventPublisher);
        couponEventPublish(eventPublisher);
        senderEventPublish(eventPublisher);
    }
    private void adminEventPublish(ApplicationEventPublisher eventPublisher) {
        eventPublisher.publishEvent(new UserAdminEvent(this, this.name));
    }

    private void couponEventPublish(ApplicationEventPublisher eventPublisher) {
        eventPublisher.publishEvent(new UserCouponEvent(this, this.email));
    }

    private void senderEventPublish(ApplicationEventPublisher eventPublisher) {
        eventPublisher.publishEvent(new UserSenderEvent(this, this.email, this.phoneNumber));
    }
}

