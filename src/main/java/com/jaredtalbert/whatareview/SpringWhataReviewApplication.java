package com.jaredtalbert.whatareview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.io.IOException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringWhataReviewApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringWhataReviewApplication.class, args);
	}

}
