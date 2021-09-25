package com.example912.demo912.service;

import java.util.List;

import com.example912.demo912.model.User;

public interface lUserService {
	public User createUser(User user);

	public List<User> getAllUsers();

	public User getUser(int userid);

	public int deleteUser(int userid);

}
