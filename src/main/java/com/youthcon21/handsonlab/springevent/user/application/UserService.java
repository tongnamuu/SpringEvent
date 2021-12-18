package com.youthcon21.handsonlab.springevent.user.application;


import com.youthcon21.handsonlab.springevent.admin.application.AdminService;
import com.youthcon21.handsonlab.springevent.admin.application.CouponService;
import com.youthcon21.handsonlab.springevent.sender.application.SenderService;
import com.youthcon21.handsonlab.springevent.user.domain.User;
import com.youthcon21.handsonlab.springevent.user.repository.UserRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserService {

    private final UserRepository userRepository;
    private final ApplicationEventPublisher eventPublisher;
    private final SenderService senderService;

    public UserService(UserRepository userRepository, ApplicationEventPublisher eventPublisher, SenderService senderService) {
        this.userRepository = userRepository;
        this.eventPublisher = eventPublisher;
        this.senderService = senderService;
    }

    public void create(UserRequest userRequest) {
        User user = new User(
                userRequest.getName(),
                userRequest.getEmail(),
                userRequest.getPhoneNumber()
        );
        userRepository.save(user);
        user.registerEventPublish(eventPublisher);
        senderService.sendSMS(user.getPhoneNumber());
        senderService.sendEmail(user.getEmail());
    }

    public UserResponse get(String email) {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException(""));

        return new UserResponse(
                user.getName(),
                user.getEmail(),
                user.getPhoneNumber()
        );
    }
}