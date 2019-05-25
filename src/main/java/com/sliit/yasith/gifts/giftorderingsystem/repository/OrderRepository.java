package com.sliit.yasith.gifts.giftorderingsystem.repository;

import com.sliit.yasith.gifts.giftorderingsystem.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
