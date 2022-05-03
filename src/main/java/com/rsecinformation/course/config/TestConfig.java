package com.rsecinformation.course.config;

import com.rsecinformation.course.entities.User;
import com.rsecinformation.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "998888888","12345678");
        User u2 = new User(null, "Alex Grenn", "alex@gmail.com", "995555555","12345678");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
