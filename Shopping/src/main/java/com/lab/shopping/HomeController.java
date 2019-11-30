package com.lab.shopping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lab.common.StringParser;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request, Locale locale, Model model) {
		String userAgent = (String)request.getHeader("User-Agent");
		System.out.println(userAgent);
		if(StringParser.isNotEmpty(userAgent)) {
				if(userAgent.indexOf("Mobile") > -1) {
					System.out.println("1111");
					return "redirect:/m";
			}
		}
		model.addAttribute("userAgent", userAgent);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home/index.home";
	}
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/m", method = RequestMethod.GET)
	public String mobileHome(HttpServletRequest request, Locale locale, Model model) {
		String userAgent = (String)request.getHeader("User-Agent");
		System.out.println(userAgent);
		if(StringParser.isNotEmpty(userAgent)) {
				if(userAgent.indexOf("Mobile") < 0) {
					return "redirect:/";
			}
		}
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "mobile/home/index";
	}
}
