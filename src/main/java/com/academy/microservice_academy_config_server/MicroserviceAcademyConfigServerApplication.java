package com.academy.microservice_academy_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MicroserviceAcademyConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceAcademyConfigServerApplication.class, args);
	}

}
