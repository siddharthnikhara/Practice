package com.training;

import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class KafkaConsumerClient {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers", "localhost:9092");
		properties.setProperty("key.deserializer", StringDeserializer.class.getName());
		properties.setProperty("value.deserializer", StringDeserializer.class.getName());

		properties.setProperty("group.id", "666");

		properties.setProperty("session.timeout.ms", "30000");

		properties.setProperty("auto.offset.reset	", "earliest");
		properties.setProperty("max.partition.fetch.bytes", "2");
		properties.setProperty("ssl.truststore.location", "2");
		properties.put("num.partitions", 4);

		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(properties);

		consumer.subscribe(Arrays.asList("topicA"));

		while (true) {
			ConsumerRecords<String, String> consumerRecord = consumer.poll(1000);

			System.out.println("count no message got" + consumerRecord.count());
			for (ConsumerRecord<String, String> temp : consumerRecord) {
				System.out.println("key: " + (temp.key()+1) + "  value::  " + temp.value() + "  partition:: "
						+ (temp.partition()) + "  topic:: " + temp.topic() + "  time  " + new Date(temp.timestamp()));
			}
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
