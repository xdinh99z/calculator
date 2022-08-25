package com.xdinh99z.calculator;

import com.hazelcast.client.config.ClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableCaching
public class CalculatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}
@Bean
public ClientConfig hazelcastClientConfig() {
	ClientConfig clientConfig = new ClientConfig();
	clientConfig.getNetworkConfig().addAddress("hazelcast");
	return clientConfig;
	}

}
