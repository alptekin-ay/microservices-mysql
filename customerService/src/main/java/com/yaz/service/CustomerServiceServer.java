package com.yaz.service;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@EnableDiscoveryClient
@ComponentScan("com.yaz")
public class CustomerServiceServer {

	protected Logger logger = Logger.getLogger(CustomerServiceServer.class.getName());

	
	public static void main(String[] args) {
		
		SpringApplication.run(CustomerServiceServer.class, args);
	}
}
