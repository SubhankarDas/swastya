package com.codespark.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Service Registration and Discovery
 * 
 * A service registry is a phone book for your microservices. Each service
 * registers itself with the service registry and tells the registry where it
 * lives (host, port, node name) and perhaps other service-specific metadata -
 * things that other services can use to make informed decisions about it.
 * 
 * @author Subhankar Das
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}

}