package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mycontroller {
@RequestMapping("/xyz")
public String hi() {
	return "abc";
}
@RequestMapping("/lunch")
public String hloo() {
	return "demo";
}
}
