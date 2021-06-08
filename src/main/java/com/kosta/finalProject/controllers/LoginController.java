package com.kosta.finalProject.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kosta.finalProject.services.LoginService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class LoginController {
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());

	    private final LoginService loginService;
	    
	    @RequestMapping("/login")
	    public String home(Model model) {
	    	logger.info("loginPage");
	    	return "aa";
	    }
	    
	    @GetMapping(value = "/logout")
	    public String LogoutPage(HttpServletRequest request,HttpServletResponse response) {
	    	logger.info("logoutttt");
	        return "redirect:/login";
}
}
