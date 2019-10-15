package com.esempla.demo.controller;


import com.esempla.demo.domain.User;
import com.esempla.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @GetMapping("/list")
    ResponseEntity<List<User>> getAllUsers() {

        log.debug("Request to find all users.");

        return ResponseEntity.ok(userService.findAll());

    }
}
