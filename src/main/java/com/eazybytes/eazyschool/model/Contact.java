package com.eazybytes.eazyschool.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;


public class Contact {
	
	@NotBlank(message="Name should not be blank")
	@Size(min=3,message="Name hould not be less than 3 characters")
	private String name;

	@NotBlank(message="Mobile Number should not be blank")
	@Pattern(regexp="(^$|[0-9]{10})",message="Mobile number should be 10 digits")
	private String mobileNum;
	
	
	@Email(message="Email should be in proper format")
	@NotBlank(message="Email should not be blank")
	private String email;
	
	@NotBlank(message="Subject should not be blank")
	@Size(min=3,message="subject should not be less than 3 characters")
	private String subject;
	
	@NotBlank(message="Message should not be blank")
	@Size(min=5,message="Message should be atleast 5 in characters")
	private String message;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
		public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}
