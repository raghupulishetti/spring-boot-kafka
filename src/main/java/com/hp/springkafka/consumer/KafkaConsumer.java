package com.hp.springkafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(id = "foo", topics = "test-topic")
	public void listen(String data) {

		System.out.println("Listned message----  " + data);
	}
}
