package com.jpa.test.bootjpaexample;

import com.jpa.test.dao.UserRepo;
// import com.jpa.test.dao.UserRepo;
import com.jpa.test.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepo urp = context.getBean(UserRepo.class);
		User user = new User();
		user.setName("Osaid");
		user.setCity("Delhi");
		user.setStatus("I am Java");
		User user1 = urp.save(user);
		System.out.println(user1);

	}
}
