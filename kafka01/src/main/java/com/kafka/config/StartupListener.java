package com.kafka.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

@Component
public class StartupListener implements ApplicationRunner {
    private static int i = 0;
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public void sendMessage(String msg) {
        kafkaTemplate.send("testDemo",  "" + i++,  msg);
    }

    @KafkaListener(topics = "testDemo", groupId = "group-id")
    public void listen(KafkaConsumer<String, String> consumer) {
        consumer.subscribe(Collections.singletonList("testDemo"));
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord<String, String> record : records)
                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
        }
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            sendMessage("Now: " + new Date());
            Thread.sleep(2000);
        }
    }
}
