package com.sliit.yasith.gifts.giftorderingsystem.repository;

import com.sliit.yasith.gifts.giftorderingsystem.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
