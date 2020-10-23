package com.jasmine.dojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	private String[] getLanguages() {
		return new String[] {
				"HTML","JAVA","PYTHON","JAVASCRIPT"
		};
	}
		private String[] getLocations() {
			return new String[] {
				"Seattle","Dallas","San Jose","Chicago","Tusla"
		};
	}
		@RequestMapping("/")
		public String Index(Model model) {
		    model.addAttribute("languages", getLanguages());
		    model.addAttribute("locations", getLocations());
		    return "index.jsp";
		}
		@RequestMapping(value="/survey", method=RequestMethod.POST)
		public String Results(@RequestParam(value="name") String name, 
		        @RequestParam(value="language") String language,
		        @RequestParam(value="location") String location,
		        @RequestParam(value="comment") String comment,
		        Model model){
		    model.addAttribute("result", new Survey(name, location, language, comment));
		    return "result.jsp";
		}
}
