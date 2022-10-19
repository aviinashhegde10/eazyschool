package com.eazybytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.eazybytes.eazyschool.Holiday;
import com.eazybytes.eazyschool.Holiday.Type;

@Controller
public class HolidayController {
	
	@GetMapping("/holidays")
	public String getHolidays(Model model)
	{
		
		Holiday[] hol=new Holiday[10];
		hol[0]=new Holiday("14th January 2022","Makara Sankrathi",Type.FESTIVAL);
		hol[1]=new Holiday("26th January 2022","Republic day",Type.GOVERNMENT);
		hol[2]=new Holiday("08th February 2022","Shivarathri",Type.FESTIVAL);
		hol[3]=new Holiday("24th March 2022","Ugadi",Type.FESTIVAL);
		hol[4]=new Holiday("4th April 2022","Good Friday",Type.FESTIVAL);
		hol[5]=new Holiday("15th August 2022","Independence day",Type.GOVERNMENT);
		hol[6]=new Holiday("31st Aug 2022","Ganesha chathurthi",Type.FESTIVAL);
		hol[7]=new Holiday("14th October 2022","Dusserha",Type.FESTIVAL);
		hol[8]=new Holiday("02nd November 2022","Diwali",Type.FESTIVAL);
		hol[9]=new Holiday("25th December 2022","Christmas",Type.FESTIVAL);
		model.addAttribute("Holidays", hol);
		return "holidays";
		
	}

}
