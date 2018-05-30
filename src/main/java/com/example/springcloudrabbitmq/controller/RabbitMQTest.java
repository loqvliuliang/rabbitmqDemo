package com.example.springcloudrabbitmq.controller;

import com.example.springcloudrabbitmq.sender.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rabbit")
public class RabbitMQTest {

    @Autowired
    private Sender sender;

    @GetMapping
    public void send() throws Exception {
        sender.send();
    }
}
