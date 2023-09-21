package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
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
//		
//		User user=new User();
//		user.setName("Gautam Singh Rajput");
//		user.setCity("Kolkata");
//		user.setStatus("Available");
//		
//		User user1=userRepository.save(user);
//		
//		System.out.println(user1);
		
		//Create Object Of User
		
//		User user1=new User();
//		user1.setName("Uttam");
//		user1.setCity("City1");
//		user1.setStatus("Python Programmer");
//		
//		User user2=new User();
//		user2.setName("Ankit");
//		user2.setCity("City2");
//		user2.setStatus("Java Programmer");
		
		//Saving single user
		//userRepository.save(user1);
		
		//saving multiple users
//		List<User> users=List.of(user1,user2);
//		Iterable<User> result=  userRepository.saveAll(users);
//		result.forEach(user->{
//			System.out.println(user);
//
//		});
		
		//Update the user of id 153
		
//		Optional<User> optional= userRepository.findById(153);
//		User user= optional.get();
//		user.setName("Ankit Tiwary");
//		User result=userRepository.save(user);
//		
//		System.out.println(result);
		
		//how to get the data
		
		//findById(id)-return Optional containing your data
		Iterable<User> itr= userRepository.findAll();
//		Iterator<User> iterator=itr.iterator();
//		while(iterator.hasNext())
//		{
//			User user=iterator.next();
//			System.out.println(user);
//		}
		
		//Deleting the user element
		
//		userRepository.deleteById(153);
//		System.out.println("delted");
//		
		
		List<User> users= userRepository.findByName("Uttam");
		users.forEach(e->System.out.println(e));
		
		
		
	}

}
