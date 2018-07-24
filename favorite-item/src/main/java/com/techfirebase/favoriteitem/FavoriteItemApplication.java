package com.techfirebase.favoriteitem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author VIVEK KUMAR SINGH
 * @since (2018-07-25 01:50:38)
 */
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
public class FavoriteItemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FavoriteItemApplication.class, args);
	}
}
