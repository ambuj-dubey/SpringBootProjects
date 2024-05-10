package com.practice.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	
	@RequestMapping(value ="/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler");
		
		//Putting data in model
		model.addAttribute("name","Ambuj Dubey");
		model.addAttribute("CurrentDate", new Date(0).toLocaleString());
		return "about"; //about.html it get called dynamically
	}
	
	@GetMapping("/example-loop")
	public String  iterateHandler(Model m) {								//Model is used to send the list 
		
		//create list, set collection
		
		List<String> names = List.of("Ambuj","Ankit","Aman","Nitya");
		m.addAttribute("names",names);
		return "iterate";
	}
	
	@GetMapping("/condition")
	public String ConditionalHandler(Model m) {
		System.out.println("Conditional handler executed");
		m.addAttribute("isActive", true);
		m.addAttribute("gender", "F");
		
		List<Integer> list = List.of(233,43,53,6456,64);
		m.addAttribute("myList", list);
		
		return "condition";
	}
	@GetMapping("/service")
	//handler for including fragment
	public String serviceHandler(Model m) {
		return "service";
	}

}
