package com.youthcon21.handsonlab.springevent.user.repository;

import com.youthcon21.handsonlab.springevent.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
