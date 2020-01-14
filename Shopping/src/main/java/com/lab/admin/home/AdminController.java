package com.lab.admin.home;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lab.dto.MemberDto;
import com.lab.shopping.HomeController;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String main(HttpServletRequest request, Locale locale, Model model) {
		return "admin/index.noLayout";
	}
	
	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public String loginProc(HttpServletRequest request,MemberDto member, Locale locale, Model model) {
		
		//MemberDto memberVo = loginService.selectLoginInfo(member);
		
		return "admin/index.noLayout";
	}
}
