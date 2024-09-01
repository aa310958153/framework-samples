package com.example.sampletransactionmessagetest;

import com.iocoder.integral.messaging.annotations.configuration.EnableGlobalMethodTransactionalMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableGlobalMethodTransactionalMessage
public class SampleTransactionMessageTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleTransactionMessageTestApplication.class, args);
    }

}
