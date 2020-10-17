package com.ifpe.servicoWeb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ifpe.servicoWeb.entities.User;
import com.ifpe.servicoWeb.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Clara", "mariac@gmail.com", "400289226", "123476");
		User u2 = new User(null, "Alex Morgan", "alex@gmail.com", "123456789", "127456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	

}
