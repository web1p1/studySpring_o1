package com.wind.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/content")
public class AnoController {
	
	@RequestMapping("/contentview")
	public String contentView(Model model) {
		model.addAttribute("id", "GANA");
		
		return "content/contentview";
		
	}

}
