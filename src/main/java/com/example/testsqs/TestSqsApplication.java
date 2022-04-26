package com.example.testsqs;

import com.example.testsqs.messages.CustomMessageOne;
import com.example.testsqs.messages.JsonMessage;
import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.handler.annotation.Header;

import java.util.logging.Logger;

@SpringBootApplication
@Slf4j
public class TestSqsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSqsApplication.class, args);
    }

    @SqsListener(value = "teste-queue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void receiveMessage(
            JsonMessage<CustomMessageOne> message,
            @Header("SenderId") String senderId
    ) {
        log.info("message received {} {}", senderId, message);
    }

}
