package com.kafka.day2;

public interface KafkaProperties {
	String topic1 = "sample";
	String topic2 = "sample-a";

	String kafka_server_url = "localhost";
	int kafka_server_port = 9098;

	int kafka_producer_buffer_size = 100 * 1024;

	int connection_time_out = 1000 * 10 * 10;

	String client_id = "SimpleConsumerDemoClient";
	String producer_client_id = "demoProducer";
}
