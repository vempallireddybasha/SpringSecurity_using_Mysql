package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entirty.Role;
import com.example.demo.entirty.User;
import com.example.demo.repository.UserRepository;

@RestController
public class MyController {

	@Autowired
	private UserRepository userRepository;

	//@PreAuthorize("hasRole(USER)")
	@GetMapping("/user")
	public String getuser() {
		return "Hi User";
	}
	//@PreAuthorize("hasRole(ADMIN)")
	@GetMapping("/admin")
	public String getadmin() {
		return "Hi Admin";
	}
//	@PostMapping("/user/save")
//	public ResponseEntity<User> saveUser(@RequestBody User user){
//		Role role=new Role();
//		role.setName("USER");
//		List<Role> newrole= new ArrayList<Role>();
//		newrole.add(role);
////		String password=user.getPassword();
////		user.setPassword(new BCryptPasswordEncoder().encode(password));
//		user.setRoles(newrole);
//		userRepository.save(user);
//		return new ResponseEntity<User>(user,HttpStatus.OK);
//
//	}
}
