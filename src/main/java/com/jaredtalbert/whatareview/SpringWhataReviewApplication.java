package com.jaredtalbert.whatareview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.io.IOException;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.jaredtalbert.whatareview.repository")
public class SpringWhataReviewApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringWhataReviewApplication.class, args);
	}

}
