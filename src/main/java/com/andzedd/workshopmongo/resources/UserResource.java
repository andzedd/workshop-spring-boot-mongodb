package com.andzedd.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andzedd.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User test = new User("1", "test", "test@gmail.com");
		User test2 = new User("2", "test2", "test2@gmail.com");
		User test3 = new User("3", "test3", "test3@gmail.com");
		
		List<User> users = new ArrayList<>();
		users.addAll(Arrays.asList(test,test2,test3));
		
		return ResponseEntity.ok().body(users);
	}
}
