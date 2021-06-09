package com.kosta.finalProject.services;


import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.kosta.finalProject.login.SecurityUser;
import com.kosta.finalProject.models.UserVO;
import com.kosta.finalProject.persistences.LoginRepository;


@Service
public abstract class LoginService implements UserDetailsService {
	  @Autowired
      private LoginRepository repo;
        
      @Autowired
      private PasswordEncoder passwordEncoder;
        
      @Transactional
      public UserVO joinUser(UserVO user) {
    	  user.setUserPw(passwordEncoder.encode(user.getUserPw()));
		return repo.save(user);
      }
      
      @Override
      public UserDetails loadUserByUsername(String nickName) throws UsernameNotFoundException {
          //회원 이름으로 회원을 조회 한다.      
          UserDetails user = repo.findById(nickName)
        		  .filter(u ->u!=null).map(u->new SecurityUser(u)).get();
 return user;
      }
}