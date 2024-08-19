package com.example.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/send")
    public String sendMessageToKafkaTopic(@RequestBody String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka successfully!";
    }
}
