package com.primer.mikroservisi.eureka.eurekaprimersayoutubea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaPrimerSaYoutubeaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPrimerSaYoutubeaApplication.class, args);
	}

}

