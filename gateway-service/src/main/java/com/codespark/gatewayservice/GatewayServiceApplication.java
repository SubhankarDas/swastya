package com.codespark.gatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Gateway Service for API Routing
 * 
 * Spring Cloud Gateway aims to provide a simple, yet effective way to route to
 * APIs and provide cross cutting concerns to them such as: security,
 * monitoring/metrics, and resiliency.
 * 
 * @author Subhankar Das
 *
 */
@SpringBootApplication
public class GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServiceApplication.class, args);
	}

}