package com.esempla.demo.utils;

import com.esempla.demo.domain.User;
import com.esempla.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;
import java.util.stream.Stream;


@Slf4j
@Component
@RequiredArgsConstructor
public class DbPopulatorUtils implements CommandLineRunner {


    private final UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {


        Stream.of(

                User.builder()
                        .name("John1")
                        .email("john1@mail.ru")
                        .active(true)
                        .age(22)
                        .build(),

                User.builder()
                        .name("Mike1")
                        .email("mike1@mail.ru")
                        .active(false)
                        .age(19)
                        .build()

        ).collect(Collectors.toList())
                .stream()
                .peek(user -> log.info("{}", user))
                .forEach(user -> userRepository.save(user));

    }
}
