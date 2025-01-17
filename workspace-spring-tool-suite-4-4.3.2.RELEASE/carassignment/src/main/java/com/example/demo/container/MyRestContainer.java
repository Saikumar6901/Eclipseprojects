package com.example.demo.container;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CarDBDemo;
import com.example.demo.car;

@RestController
@RequestMapping("/webs")
public class MyRestContainer {
	@Autowired
	CarDBDemo dao;
	
	@RequestMapping("/cars")
	public String hi() {
		return "hi";
	}
	
	@GetMapping("/cars/{id}")
	public Optional<car> getCarById(@PathVariable int id) {
		return dao.findById(id);
	}

	@PostMapping("/cars")
	public String createCar (@RequestBody car c) {
		if(dao.existsById(c.getId())) {
			return "car already exists with that id";
		}
		dao.save(c);
		return "Successfully created";
	}

	@GetMapping("/cars")
	public List<car> getAllCars() {
		return dao.findAll();
	}

	@PutMapping("/cars")
	public String updateCar(@RequestBody car c) {
		if(dao.existsById(c.getId())) {
			dao.save(c);
			return "updated";
		}
		return "Id doesn't exists";
	}
	
}
