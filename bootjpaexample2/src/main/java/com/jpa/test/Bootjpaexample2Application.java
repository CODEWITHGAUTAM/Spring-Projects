package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.jpa.test.entities.User;
import com.jpa.test.dao.UserRepository;

@SpringBootApplication
public class Bootjpaexample2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Bootjpaexample2Application.class, args);
		UserRepository userRepository= context.getBean(UserRepository.class);
		
		User user=new User();
		user.setName("Gautam Singh Rajput");
		user.setCity("Kolkata");
		user.setStatus("Available");
		
		User user1=userRepository.save(user);
		
		System.out.println(user1);
	}

}
