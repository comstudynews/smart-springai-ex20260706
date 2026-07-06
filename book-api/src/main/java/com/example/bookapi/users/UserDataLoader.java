package com.example.bookapi.users;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDataLoader {

    @Bean
    CommandLineRunner initUsers(UserRepository userRepository) {
        return args -> {
            if (userRepository.count() == 0) {
                userRepository.save(new AppUser("Kim", "kim@kkk.com", 22));
                userRepository.save(new AppUser("Lee", "lee@kkk.com", 25));
                userRepository.save(new AppUser("Park", "park@kkk.com", 28));
            }
        };
    }
}
