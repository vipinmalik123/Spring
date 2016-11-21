package org.vmalik.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.vmalik.core.HelloWorld;

@Controller
public class HomeController {
	
	@Autowired
	private final HelloWorld helloBean;

	@Autowired
	public HomeController(HelloWorld helloBean) {
		this.helloBean = helloBean;
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView home() {
		
		ModelAndView model = new ModelAndView();
		
		model.setViewName("index");
		model.addObject("message", helloBean.getName());
		model.addObject("pageTitle", "SpringExample");
		
		return model;
	}

	@RequestMapping(value="/{name:[A-Za-z]+}", method=RequestMethod.GET)
	public ModelAndView home(@PathVariable("name") String name) {
		
		ModelAndView model = new ModelAndView();
		
		model.setViewName("index");
		model.addObject("message", name);
		model.addObject("pageTitle", "SpringExample");
		
		return model;
	}

}