package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping(value="/helloworld")
public class Helloworld {
	public Helloworld() {
		System.out.println("jhiphioqwehfo");
	}
	
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	public String hi(Model model) {
		//System.out.println("hi");
		model.addAttribute("message","hi everyone");
	return "success";	
	}
	@RequestMapping(value="/name", method=RequestMethod.GET)
	public String namePlease(@RequestParam("name") String name,Model model) {
		//System.out.println("hi");
		model.addAttribute("message",name);
	return "success";	
	}
	@RequestMapping(value="/independence", method=RequestMethod.GET)
	public String specialDay(Model model) {
	//	System.out.println("hi");
		model.addAttribute("message","Happy indepence day");
	return "success";	
	}
//	@RequestMapping("/msg.htm")
//	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
//        ModelAndView mv=new ModelAndView();
//        mv.setViewName("success");
//        mv.addObject("message","Hello World Spring MVC");
//        return mv;
//    }
	
}
