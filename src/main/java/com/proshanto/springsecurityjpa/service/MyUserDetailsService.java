package com.proshanto.springsecurityjpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.proshanto.springsecurityjpa.entity.MyUserDetails;
import com.proshanto.springsecurityjpa.entity.User;
import com.proshanto.springsecurityjpa.repository.UserRepository;



@Service
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {		
		Optional<User> user=  userRepository.findByUserName(username);		
		return user.map(MyUserDetails::new).get();
	}

}
