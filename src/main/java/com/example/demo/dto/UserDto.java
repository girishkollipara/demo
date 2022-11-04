package com.example.demo.dto;

import com.example.demo.model.UserModel;

public class UserDto {

	private Long user_id;
	private String first_name;
	private String last_name;
	private String username;
	private String password;
	private String role;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
		public static UserDto getDto(UserModel i) {

	        UserDto udt = new UserDto();
	        udt.setUser_id(i.getId());
	        udt.setFirst_name(i.getFirst_name());
	        udt.setLast_name(i.getLast_name());
	        udt.setUsername(i.getUsername());
	        udt.setPassword(i.getPassword());
	        return udt;
	    
		
		
	}
}
