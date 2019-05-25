package com.sliit.yasith.gifts.giftorderingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GiftOrderingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(GiftOrderingSystemApplication.class, args);
    }

}
