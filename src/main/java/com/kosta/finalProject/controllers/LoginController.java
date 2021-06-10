package com.kosta.finalProject.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.kosta.finalProject.models.UserVO;


@Controller
public class LoginController {

    @GetMapping(value = "/login")
    public String login(HttpServletRequest req) {
//    	String referer = req.getHeader("Referer"); // 현재 요청된 페이지의 이전 페이지 주소 정보를 포함
//    	req.getSession().setAttribute("prevPage", referer);
        return "login";
    }

    @RequestMapping("/hello")
    public String root() {
        return "hello";
    }
    @RequestMapping("/logout")
    public void root2() {
 
    }
    @RequestMapping("/accessDenied")
    public void root3() {
 
    }
    public UserVO getUser() { //
        UserVO user = new UserVO();
        SecurityContext ctx = SecurityContextHolder.getContext();
        Authentication auth = ctx.getAuthentication();
        if (auth.getPrincipal() instanceof UserDetails) user = (UserVO) auth.getPrincipal();
        return user;
    }

    public HttpServletRequest getRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
}