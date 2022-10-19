package com.eazybytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value={"", "/", "home"})
    public String displayHomePage() {
        return "home.html";
    }
    
    @RequestMapping("/courses")
    public String displayCoursePage()
    {
    	return "courses";
    }
    
    @RequestMapping("/about")
    public String displayAboutPage()
    {
    	return "about";
    }
    
   /* @RequestMapping("/contact")
    public String displayContactPage()
    {
    	return "contact";
    }
*/
}
