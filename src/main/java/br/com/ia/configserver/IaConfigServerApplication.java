package br.com.ia.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class IaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IaConfigServerApplication.class, args);
	}

}
