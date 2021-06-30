package com.example.mongodemo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableMongoRepositories
@EnableJms
public class MongoDemoApplication implements CommandLineRunner {

	@Autowired
	UserRepo userRepo;

	public static void main(String[] args) {

		SpringApplication.run(MongoDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

}
