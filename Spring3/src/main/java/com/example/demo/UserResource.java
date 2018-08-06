package com.example.demo;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ControllerLinkBuilderFactory;
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

	@GetMapping(path = "/usersOld/{userId}")
	public User getOneUser(@PathVariable int userId) {
		User getUser = userService.getUser(userId);
		if (getUser == null) {
			System.out.println("sid");
			throw new UserNotFoundException("id--" + userId);
		}
		return getUser;
	}
	///////////////////////////////////////////////
	// additional link also given

	@GetMapping(path = "/users/{userId}")
	public Resource<User> getOneUserv2(@PathVariable int userId) {
		User getUser = userService.getUser(userId);
		if (getUser == null) {
			throw new UserNotFoundException("id--" + userId);
		}
		Resource<User> resource = new Resource<User>(getUser);
		System.out.println("1");
		
		ControllerLinkBuilder linkTo = new ControllerLinkBuilderFactory()
				.linkTo(methodOn(this.getClass()).getAllUser());
		
		
		System.out.println("2");
		
		resource.add(linkTo.withRel("all-users"));
		return resource;
	}

	@PostMapping("/usersOld")
	public void createUser(@RequestBody User user) {
		User saveUser = userService.saveUser(user);
		System.out.println(user);
	}

	@PostMapping("/users")
	public Resource<User> createUser1(@RequestBody User user) {
		System.out.println("User id to save is " + user.getUserId());
		User saveUser = userService.saveUser(user);
		
		
		System.out.println(user);
		
		
		ControllerLinkBuilder linkTo = new ControllerLinkBuilderFactory()
				.linkTo(methodOn(this.getClass()).getAllUser());
		
		Resource<User> resource = new Resource<User>(saveUser);

		resource.add(linkTo.withRel("select-user"));
		return resource;
	}

	@PostMapping("/usersv2")
	public ResponseEntity<Object> createUserResponseCode(@RequestBody User user) {
		User saveUser = userService.saveUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{userId}")
				.buildAndExpand(saveUser.getUserId()).toUri();
		return ResponseEntity.created(location).build();

	}
}
