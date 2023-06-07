package com.wind.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/board/view")
	public String view(Model model) {
		model.addAttribute("id", 20);
		model.addAttribute("name", "ABC");
		System.out.println(model);
		return "board/view";
	}
	
	// board/content
	@RequestMapping("/board/content")
	public String content(Model model) {
		model.addAttribute("id", 10);
		return "board/content";
	}
	
	// board/reply
	@RequestMapping("/board/reply")
	public ModelAndView reply() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", 15);
		mv.addObject("name", "Wind");
		mv.setViewName("board/reply");
		return mv;
	}
	
}
