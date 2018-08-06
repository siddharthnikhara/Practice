package com.kafka.day2;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

public class Producer extends Thread {
	private KafkaProducer<Integer, String> producer;
	private String topic;
	private Boolean isAsync;
	private Boolean interupt;
	private String name;

	public Producer(String topic, Boolean isAsync, String name) {
		super();
		this.topic = topic;
		this.isAsync = isAsync;
		interupt = false;
		this.name = name;
		Properties prop = new Properties();
		prop.setProperty("bootstrap.servers",
				KafkaProperties.kafka_server_url + " :" + KafkaProperties.kafka_server_port);

		prop.setProperty("client.id", "producer_client_id");

		prop.setProperty("key.serializer", IntegerSerializer.class.getName());

		prop.setProperty("value.serializer", StringSerializer.class.getName());

		producer = new KafkaProducer<>(prop);

	}

	@Override
	public void run() {
		int messageNo = 1;
		while (!interupt) {

			String messageString = "Message from producer" + this.name + "  count::  " + messageNo;

			if (isAsync) {
				ProducerRecord<Integer, String> produceRecord = new ProducerRecord<Integer, String>(this.topic,
						messageNo, messageString);
				// send asynchronus
				long startTime = System.currentTimeMillis();
				producer.send(produceRecord, new ProducerMessgaeCallable(startTime, messageNo, messageString));
			} else {
				try {
					ProducerRecord<Integer, String> produceRecord = new ProducerRecord<Integer, String>(this.topic,
							messageNo, messageString);
					producer.send(produceRecord).get();
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			}
			messageNo++;
		}
		producer.flush();
		producer.close();
	}

	public void setInterupt(Boolean interupt) {
		this.interupt = interupt;
	}

}
