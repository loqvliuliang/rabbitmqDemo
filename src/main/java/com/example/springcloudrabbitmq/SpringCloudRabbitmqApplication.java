package com.example.springcloudrabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient//eureka 客户端
@EnableFeignClients// feign 客户端
public class SpringCloudRabbitmqApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRabbitmqApplication.class, args);
	}
}
