package com.example.demo;

import com.example.demo.node.User;
import com.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner demo(UserRepository userRepository){
		return args -> {
			Iterable<User> userIterator = userRepository.findAll();
			Stream<User> userStream = StreamSupport.stream(userIterator.spliterator(),false);

			if(userStream.filter(user -> user.getEmail().equals("test@test.com")).count() == 0) {
				User user = new User();
				user.setEmail("test@test.com");
				user.setName("test.name");
				user.setPassword("test.password");
				userRepository.save(user);
			}
		};
	}

}
