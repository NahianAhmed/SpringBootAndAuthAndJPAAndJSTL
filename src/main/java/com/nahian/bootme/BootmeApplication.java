package com.nahian.bootme;

import com.nahian.bootme.Repository.AuthRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackageClasses = AuthRepository.class)
public class BootmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootmeApplication.class, args);
	}

}
