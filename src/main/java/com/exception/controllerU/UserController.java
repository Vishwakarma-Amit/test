package com.exception.controllerU;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.dto.UserRequest;
import com.exception.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<UserRequest>> getAllUsers(){
		return new ResponseEntity<List<UserRequest>>(userService.getAllUser(), HttpStatus.OK);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<UserRequest> getUserByUserId(@PathVariable int userId){
		return new ResponseEntity<UserRequest>(userService.getUserById(userId), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<UserRequest> createUser(@RequestBody UserRequest request){
		return new ResponseEntity<UserRequest>(userService.saveUser(request), HttpStatus.CREATED);
	}
}
