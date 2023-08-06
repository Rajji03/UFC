package com.backend.ufc;

import com.backend.ufc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableScheduling
public class UfcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UfcApplication.class, args);
	}

	@Autowired
	UserService userService;
	@Override
	public void run(String... args) throws Exception {
//		IntStream.range(0,10)
//				.forEach(i->{
//					userService.scheduleFixedDelayTask();
//					userService.scheduleFixedRateWithInitialDelayTask();
//				});
	}
}
