package com.sliit.yasith.gifts.giftorderingsystem.repository;

import com.sliit.yasith.gifts.giftorderingsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
