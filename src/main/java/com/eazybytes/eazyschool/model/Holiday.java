package com.eazybytes.eazyschool.model;

import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class Holiday {

	/*public Holiday(String string, String string2, Type festival) {
		// TODO Auto-generated constructor stub
		this.day=string;
		this.reason=string2;
		this.type=festival;
	}*/
	
	private final String day;
	private final String reason;
	private final Type type;
	public Holiday(String day, String reason, Type type)
	{
		this.day=day;
		this.reason=reason;
		this.type=type;
	}
	public enum Type{
		FESTIVAL, GOVERNMENT
	}


}
