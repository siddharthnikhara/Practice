package com.training.exilant.restfulworks.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserDAOService {

	 static List<User> users = new ArrayList<>();
	 static int userCount = 103;
	static {
		users.add(new User(101, "sid", new Date()));
		users.add(new User(102, "anuj", new Date()));
		users.add(new User(101, "tanu", new Date()));

	}

	public List<User> getUsers() {
		return users;
	}

	public User saveUser(User user) {
		int count = 0;

		if (user.getUserId() == 0) {
			// user1.a
			user.setUserId(++count);
			return user;
		}

		return null;
	}

	public User getUser(int userId) {
		for (User user1 : users) {
			if (user1.getUserId() == userId) {
				// user1.a
				return user1;
			}

		}
		return null;
	}

	public User deleteUser(int userId) {
		return null;
	}

	public User updateUser(User user) {
		return null;
	}
}
