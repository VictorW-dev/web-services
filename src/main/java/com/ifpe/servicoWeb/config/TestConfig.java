package com.ifpe.servicoWeb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.ifpe.servicoWeb.entities.Category;
import com.ifpe.servicoWeb.entities.Order;
import com.ifpe.servicoWeb.entities.User;
import com.ifpe.servicoWeb.entities.enums.OrderStatus;
import com.ifpe.servicoWeb.repositories.CategoryRepository;
import com.ifpe.servicoWeb.repositories.OrderRepository;
import com.ifpe.servicoWeb.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers"); 
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User u1 = new User(null, "Maria Clara", "mariac@gmail.com", "400289226", "123476");
		User u2 = new User(null, "Alex Morgan", "alex@gmail.com", "123456789", "127456"); 
		
		Order o1 = new Order(null, Instant.parse("2020-09-17T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2020-10-16T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2020-10-15T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	

}
