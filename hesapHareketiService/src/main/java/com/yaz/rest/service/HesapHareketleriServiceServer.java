package com.yaz.rest.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@EnableEurekaClient
@ComponentScan("com.yaz")
public class HesapHareketleriServiceServer {
	
	public static void main(String[] args) {

		SpringApplication.run(HesapHareketleriServiceServer.class, args);
	}
}