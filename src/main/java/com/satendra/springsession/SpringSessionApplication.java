package com.satendra.springsession;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
@EnableJdbcHttpSession
public class SpringSessionApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringSessionApplication.class, args);

		//another way to bootstrap spring application context
		SpringApplication springApplication = new SpringApplication(SpringSessionApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.run(args);

	}
}
