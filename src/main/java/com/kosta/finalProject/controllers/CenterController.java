package com.kosta.finalProject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kosta.finalProject.models.CenterVO;
import com.kosta.finalProject.services.CenterService;

@Controller
public class CenterController {

	@Autowired
	CenterService cservice;
	
	@GetMapping("/center/centerlist")
	public void selectAll(Model model) {
		List<CenterVO> centerlist= cservice.selectAll();
		
		model.addAttribute("centerlist",centerlist);
	}
}
