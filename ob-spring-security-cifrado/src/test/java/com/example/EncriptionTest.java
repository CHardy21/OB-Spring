package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptionTest {

	@Test
	void bcryptTest() {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode("admin");
		
		System.out.println(hashedPassword);
		
		Boolean matches = passwordEncoder.matches("admin", hashedPassword);
		
		System.out.println(matches);
	}
	
	@Test
	void bcryptCheckMultiplePasswords() {
		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		
		for(int i=0; i<10; i++)
			System.out.println(passwordEncoder.encode("admin"));
		
		
	
	}
	
	
}
