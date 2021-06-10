package com.kosta.finalProject.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kosta.finalProject.login.SecurityUser;
import com.kosta.finalProject.models.UserVO;
import com.kosta.finalProject.persistences.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository urepo;
	
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException{
		return Optional.ofNullable(urepo.findByUserId(userId)).filter(m-> m!=null).map(m-> new SecurityUser((UserVO) m)).get();
	}
}
