package com.example.demo;

import com.example.demo.dto.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("-------------");

		var objectMapper = new ObjectMapper();

		var user = new UserRequest();
		user.setName("ishwang");
		user.setAge(39);
		user.setEmail("his@google.com");
		user.setPhoneNumber("010-1234-5678");

		String text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		var userObj = objectMapper.readValue(text, UserRequest.class);
		System.out.println(userObj.toString());
	}

}
