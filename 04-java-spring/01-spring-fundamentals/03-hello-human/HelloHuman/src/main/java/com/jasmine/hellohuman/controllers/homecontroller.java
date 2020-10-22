package com.jasmine.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class homecontroller {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hellohuman() {
		return "hello.jsp";
		}
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
		public String hellohuman(@PathVariable("name")String name, Model viewModel){
			viewModel.addAttribute("name", name);
			return "name.jsp";
	}
}


