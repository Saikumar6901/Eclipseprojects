package com.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class Message1 extends AbstractController {

	public Message1() {
		// TODO Auto-generated constructor stub
	}
	 protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
	        ModelAndView mv=new ModelAndView();
	        mv.setViewName("showMessageView");
	        
	        mv.addObject("message","Hello World Spring MVC");
	        return mv;
	    }
}
