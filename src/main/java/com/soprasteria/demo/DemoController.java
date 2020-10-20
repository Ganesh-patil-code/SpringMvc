package com.soprasteria.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class DemoController {

	@GetMapping("/welcome")
	public String show(Model model)
	{
		model.addAttribute("message","spring mvc application");
		return "welcome";
	}
	
}
