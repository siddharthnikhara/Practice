package com.training.exilant.restfulworks.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	@Autowired
	private UserDAOService userService;

	@GetMapping(path = "/users")
	public List<User> getAllUser() {
		return userService.getUsers();
	}

	@GetMapping(path = "/users/{userId}")
	public User getOneUser(@PathVariable int userId) {
		return userService.getUser(userId);
	}

	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		User saveUser = userService.saveUser(user);
		System.out.println(user);
	}

	@PostMapping("/usersv2")
	public ResponseEntity<Object> createUserResponseCode(@RequestBody User user) {
		User saveUser = userService.saveUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}")
				.buildAndExpand(saveUser.getUserId()).toUri();
		return ResponseEntity.created(location).build();

	}
}
