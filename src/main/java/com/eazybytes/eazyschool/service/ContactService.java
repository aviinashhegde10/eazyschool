package com.eazybytes.eazyschool.service;

import org.springframework.stereotype.Service;

import com.eazybytes.eazyschool.model.Contact;

@Service
public class ContactService {

	
	 public boolean saveMessageDetails(Contact contact){
	        boolean isSaved = true;
	        //TODO - Need to persist the data into the DB table
	        System.out.println(contact.getName());
	        return isSaved;
	    }
}
