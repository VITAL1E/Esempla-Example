package com.esempla.demo.service;


import com.esempla.demo.domain.User;
import com.esempla.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public List<User> findAll(){

        List<User> all = userRepository.findAll();


        log.debug("Find {} users.", all.size());


        return all;
    }
}
