package com.example912.demo912.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example912.demo912.model.User;
import com.example912.demo912.repo.UserRepository;

@Service
public class UserService implements lUserService {

	@Autowired
	private UserRepository urepo;

	@Override
	public User createUser(User user) {
		User tuser = urepo.saveUser(user);
		return tuser;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> luser = urepo.readUsers();
		return luser;
	}

	@Override
	public User getUser(int userid) {
		return urepo.getUser(userid);
	}

	@Override
	public int deleteUser(int userid) {
		return urepo.deleteUser(userid);
	}
}
