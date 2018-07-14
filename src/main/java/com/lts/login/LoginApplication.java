package com.lts.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@ComponentScan(basePackages = {"com.lts.login"})
@EntityScan(basePackages = {"com.lts.login.domain"})
@EnableJpaRepositories(basePackages = {"com.lts.login.dao"})
@EnableTransactionManagement

@SpringBootApplication
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
	}
}
