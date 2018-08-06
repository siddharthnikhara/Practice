package com.kafka.day2;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

public class ProducerMessgaeCallable implements Callback {
	private long startTime;
	private int key;
	private String message;

	public ProducerMessgaeCallable(long startTime, int key, String message) {
		super();
		this.startTime = startTime;
		this.key = key;
		this.message = message;
	}

	@Override
	public void onCompletion(RecordMetadata metadata, Exception e) {
		// when the messages is sent
		long elapsedTime = System.currentTimeMillis();
		if (metadata != null) {
			System.out.println("message :" + message + "  with key  " + key + "  , sent to " + metadata.partition()
					+ "  offset  :" + metadata.offset() + ", time taking: " + elapsedTime + "ms");
		} else {
			e.printStackTrace();
		}
	}

}
