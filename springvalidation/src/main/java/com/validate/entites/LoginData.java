package com.validate.entites;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {
	
	@NotBlank(message = "User can not be empty !!")
	@Size(min = 3, max = 12, message="User must be between 3 - 12 characters")
	private String userName;
	
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="Invalid Email !!")
	private String email;
	public String getUserName() {
		return userName;
	}
	
	@AssertTrue(message="Must  agree terms and conditions")
	private boolean agreed;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	@Override
	public String toString() {
		//System.out.println("Inside LoginData");
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}
	
	
	

}
