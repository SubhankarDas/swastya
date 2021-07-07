package com.codespark.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}

@RestController
@RequestMapping
class UserController {

	@GetMapping("/v1/users")
	public String usersv1() {
		return "users v1";
	}

	@GetMapping("/v2/users")
	public String usersv2() {
		return "users v2";
	}
	
}