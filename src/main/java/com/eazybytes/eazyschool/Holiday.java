package com.eazybytes.eazyschool;

import org.springframework.stereotype.Controller;


public class Holiday {
	
	private String day;
	private String reason;
	private Type type;
	
	public enum Type{
		FESTIVAL, GOVERNMENT
	}
	
	public Holiday(String day, String reason, Type type)
	{
		this.day=day;
		this.reason=reason;
		this.type=type;
	}
	
	public String getDay() {
		return day;
	}
	public String getReason() {
		return reason;
	}
	public Type getType() {
		return type;
	}

}
