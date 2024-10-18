package com.exception.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.dto.UserRequest;
import com.exception.entity.User;
import com.exception.exception.UserNotFoundException;
import com.exception.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public UserRequest saveUser(UserRequest userRequest) {
		return userToDto(userRepository.save(dtoToUser(userRequest)));
	}
	
	public List<UserRequest> getAllUser(){
		List<User> users = userRepository.findAll();
		return users.stream().map(u->userToDto(u)).collect(Collectors.toList());
	}
	
	
	public UserRequest getUserById(int userId) {
		return userToDto(userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException("User doesn't exist with UserId: "+userId)));
	}
	
	
	private UserRequest userToDto(User user) {
		UserRequest request = new UserRequest(
				user.getUserId(),
				user.getName(),
				user.getGender(),
				user.getEmail(),
				user.getMobile(),
				user.getAge(),
				user.getNationality());
		return request;
	}
	
	private User dtoToUser(UserRequest request) {
		User user = new User();
		user.setName(request.getName());
		user.setGender(request.getGender());
		user.setEmail(request.getEmail());
		user.setMobile(request.getMobile());
		user.setAge(request.getAge());
		user.setNationality(request.getNationality());		
		return user;
	}

}
