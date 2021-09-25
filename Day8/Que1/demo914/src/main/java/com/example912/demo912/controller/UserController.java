package com.example912.demo912.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example912.demo912.exception.UserNotFoundException;
import com.example912.demo912.model.User;
import com.example912.demo912.service.lUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private lUserService uservice;

	@PostMapping("/create")
	public User met1(@RequestBody User user) {
		return uservice.createUser(user);

	}

	@GetMapping("/getAll")
	public List<User> met2() {
		return uservice.getAllUsers();
	}

	@GetMapping("/get")
	public ResponseEntity<User> met3(@RequestParam(name = "uid", required = true, defaultValue = "1") int uid,
			@RequestHeader Map<String, String> headers) {
		System.out.println("Get Method ...");
		headers.forEach((hname, hvalue) -> {
			System.out.println(hname + "->" + hvalue + "->");
		});
		return new ResponseEntity<User>(uservice.getUser(uid), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/{uid}")
	public ResponseEntity<Object> met4(@PathVariable("uid") int uid) {
		System.out.println("Delete method called...");
		if (uservice.deleteUser(uid) == 0) 
		{
			throw new UserNotFoundException(uid+"");
		} 
		else 
		{
			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
		}
	}
}
