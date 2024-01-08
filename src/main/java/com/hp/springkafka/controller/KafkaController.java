package com.hp.springkafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hp.springkafka.service.KafkaProducer;

@RestController
public class KafkaController {

	@Autowired
	KafkaProducer producer;

	@GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
		producer.send(message);

		return "Message sent to the Kafka Topic test-topic Successfully";
	}
}
