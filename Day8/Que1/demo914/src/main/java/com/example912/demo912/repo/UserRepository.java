package com.example912.demo912.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.example912.demo912.model.*;

@Component
public class UserRepository {
	private List<User> lUser;

	public UserRepository() {
		lUser = new ArrayList<>();
		lUser.add(new User(1, "asd", "aa@gmail.com", 40));
		lUser.add(new User(2, "sdf", "sg@gmail.com", 59));
	}

	// create
	public User saveUser(User user) {
		lUser.add(user);

		return user;
	}

	// read
	public List<User> readUsers() {
		return lUser;
	}

	public User getUser(int userid) {
		User user = lUser.stream().filter((usr) -> {
			return usr.getId() == userid;
		}).findFirst().get();
		return user;
	}

	// update

	// delete
	public int deleteUser(int userid) {
		Optional<User> ouser = lUser.stream().filter((usr) -> {
			return usr.getId() == userid;
		}).findFirst();

		if (!ouser.isPresent()) {
			return 0;
		} else {
			User user = ouser.get();
			System.out.println("User : " + user);
			lUser.remove(user);
			return ouser.get().getId();
		}
	}

}
