package com.codespark.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Centralized Configuration Management
 * 
 * Spring Cloud Config provides server-side and client-side support for
 * externalized configuration in a distributed system. With the Config Server,
 * we have a central place to manage external properties for applications across
 * all environments. The default strategy for locating property sources is to
 * clone a git repository (at spring.cloud.config.server.git.uri) and use it to
 * initialize a mini SpringApplication.
 * 
 * @author Subhankar Das
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

}