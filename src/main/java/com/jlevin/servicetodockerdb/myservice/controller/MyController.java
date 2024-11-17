package com.jlevin.servicetodockerdb.myservice.controller;

import com.jlevin.servicetodockerdb.myservice.domain.User;
import com.jlevin.servicetodockerdb.myservice.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/myservice")
public class MyController {

    @Autowired
    private MyRepository myRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String sayHello() {
        Optional<User> optional = myRepository.findById(1);
        if (optional.isPresent()) {
            return optional.get().getName();
        } else {
            return "DB error";
        }
    }
}
