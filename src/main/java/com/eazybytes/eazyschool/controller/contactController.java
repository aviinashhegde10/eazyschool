package com.eazybytes.eazyschool.controller;

import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;


@Controller
public class contactController {

	private final ContactService contactService;

	@Autowired
	public contactController(ContactService contactService) {
		this.contactService = contactService;
	}

	@RequestMapping("/contact")
	public String displayContactPage(Model model) {
		model.addAttribute("contact",new Contact());
		return "contact.html";
	}

	/*@RequestMapping(value = "/saveMsg",method = POST)
    public ModelAndView saveMessage(@RequestParam String name, @RequestParam String mobileNum,
                                    @RequestParam String email, @RequestParam String subject, @RequestParam String message) {
        log.info("Name : " + name);
        log.info("Mobile Number : " + mobileNum);
        log.info("Email Address : " + email);
        log.info("Subject : " + subject);
        log.info("Message : " + message);
        return new ModelAndView("redirect:/contact");
    }*/

	 @RequestMapping(value = "/saveMsg",method = POST)
	    public String saveMessage(@Valid @ModelAttribute("contact") Contact contact, Errors errors){

	        if(errors.hasErrors()){
	            
	            return "contact.html";
	        }
	        contactService.saveMessageDetails(contact);
	        return "redirect:/contact";
	    }



}
