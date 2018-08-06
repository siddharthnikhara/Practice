package com.kafka.day2;

import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.IntegerDeserializer;

import kafka.utils.ShutdownableThread;

public class Consumer extends ShutdownableThread {

	private KafkaConsumer<Integer, String> consumer;
	private String topic;

	public Consumer(String name, boolean isInterruptible) {
		super(name, isInterruptible);
		Properties prop = new Properties();
		prop.setProperty("bootstrap.servers", "localhost:9098");
		prop.setProperty("key.deserializer", IntegerDeserializer.class.getName());
		prop.setProperty("value.deserializer", IntegerDeserializer.class.getName());
		prop.setProperty("group.id", "MyGroup");
		prop.setProperty("session.timeout.ms", "1000");

		consumer = new KafkaConsumer<>(prop);
		this.topic = name;
	}

	@Override
	public void doWork() {
		consumer.subscribe(Collections.singleton(this.topic));
		ConsumerRecords<Integer, String> records = consumer.poll(1000);

		for (ConsumerRecord<Integer, String> record : records) {
			System.out.println("REceived mesg" + record.key() + record.value() + record.offset() + record.partition());
		}

	}

}
