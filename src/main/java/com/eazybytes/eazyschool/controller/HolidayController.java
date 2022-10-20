package com.eazybytes.eazyschool.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eazybytes.eazyschool.model.Holiday;
import com.eazybytes.eazyschool.model.Holiday.Type;

@Controller
public class HolidayController {
	
	@RequestMapping("/holidays/{display}")
	public String getHolidays(@PathVariable(required=false) String display ,
			Model model)
		{
		ArrayList<Holiday>hol1=new ArrayList<Holiday>();
			int j=0;
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
		if(display.equals("festival"))
		{
			for(int i=0;i<10;i++)
			{
				if(hol[i].getType().toString()=="FESTIVAL")
				{
					System.out.println("Yes");
					hol1.add(new Holiday(hol[i].getDay(), hol[i].getReason(), hol[i].getType()));
					
				}
			}
		}
		else if(display.equals("government"))
		{
			for(int i=0;i<10;i++)
			{
				if(hol[i].getType().toString()=="GOVERNMENT")
				{
					hol1.add(new Holiday(hol[i].getDay(), hol[i].getReason(), hol[i].getType()));
					
	
				}
			}
		}
		else
		{
			for(int i=0;i<10;i++)
			{
				
				hol1.add(new Holiday(hol[i].getDay(), hol[i].getReason(), hol[i].getType()));
			
				
			}
		}
		model.addAttribute("Holidays",hol1);
		return "holidays";
		
	}

}
