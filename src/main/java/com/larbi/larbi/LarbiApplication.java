package com.larbi.larbi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
public class LarbiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LarbiApplication.class, args);
	}

}
