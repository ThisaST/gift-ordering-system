package com.sliit.yasith.gifts.giftorderingsystem.repository;

import com.sliit.yasith.gifts.giftorderingsystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
