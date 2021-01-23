package com.kafka02;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//@KafkaListener(id = "class-level", topics = "reflectoring-1")
public class KafkaClassListener {
    private final Logger LOG = LoggerFactory.getLogger(getClass());

    @KafkaListener(topics = "testDemo", groupId = "group-id")
    void listen(KafkaConsumer<String, String> consumer) {
        consumer.subscribe(Arrays.asList("testDemo"));
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord<String, String> record : records)
                LOG.info("offset = {}, key = {}, value = {}", record.offset(), record.key(), record.value());
        }
    }

    @KafkaHandler(isDefault = true)
    void listenDefault(Object object) {
        LOG.info("ClassLevel KafkaHandler[Default] {}", object);
    }
}
