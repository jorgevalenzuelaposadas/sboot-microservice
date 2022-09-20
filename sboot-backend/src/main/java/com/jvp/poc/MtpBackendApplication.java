package com.jvp.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages = "com.jvp.poc.*")
@SpringBootApplication
//@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class ,HibernateJpaAutoConfiguration.class})
@EnableJpaRepositories
public class MtpBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtpBackendApplication.class, args);
	}

}
