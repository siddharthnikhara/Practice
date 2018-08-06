package com.training;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

//https://kafka.apache.org/documentation/
public class KafkaProducerClient {
	public static void main(String[] args) {
		// set all the properties
		// the details can be kept in flat file and properties class
		// identify the kafka server details
		// when producer sends we can ask for acknowledgement

		Properties properties = new Properties();
		properties.setProperty("bootstrap.servers", "localhost:9092");
		properties.setProperty("key.serializer", StringSerializer.class.getName());
		properties.setProperty("value.serializer", StringSerializer.class.getName());
		properties.setProperty("acks", "1");
		properties.setProperty("retries", "3");
		//properties.setProperty("partitioner.class", "com.gnip.kafka.SimplePartitioner");
		//properties.setProperty("num.partitions", "4");

		Producer<String, String> producer = new KafkaProducer<String, String>(properties);
		for (int i = 0; i < 30; i++) {
			ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>("topicA", "30"+i,
					"Testinggggggggggggggggjjjjjjjjjjjjjjjjj message from java no" + i);
			
//			ProducerRecord<String, String> producerRecord1 = new ProducerRecord<String, String>("topicA", "30",
//					"Testinggggggggggggggggjjjjjjjjjjjjjjjjj message from java no" + i);
			
			producer.send(producerRecord);
		}

		producer.flush();
		producer.close();
	}
}
