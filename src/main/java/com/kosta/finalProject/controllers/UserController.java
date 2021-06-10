package com.kosta.finalProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kosta.finalProject.models.UserVO;
import com.kosta.finalProject.persistences.UserRepository;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userrepo;
	
	@PostMapping("")
	public String create(UserVO user) {
//		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		user.setUserPw(passwordEncoder.encode(user.getUserPw()));
//		userrepo.save(user);
		return "redirect:/";
	}
}
