package com.exception.dto;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class UserRequest {
	
	private int userId;
	private String name;
	private String gender;
	private String email;
	private String mobile;
	private int age;
	private String nationality;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public UserRequest(int userId, String name, String gender, String email, String mobile, int age,
			String nationality) {
		super();
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.mobile = mobile;
		this.age = age;
		this.nationality = nationality;
	}
}
