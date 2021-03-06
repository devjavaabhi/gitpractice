package com.techgeeknext.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if ("techgeeknext".equals(username)) {
			//New changes

			if(false){
				throw new UsernameNotFoundException("Test code 123:456 " + username);
				//JAva Merge
			}
			return new User("techgeeknext", "$2a$10$ixlPY3AAd4ty1l6E2IsQ9OFZi2ba9ZQE0bP7RFcGIWNhyFrrT3YUi",
					new ArrayList<>());
		} else {
			throw new ArithmeticException("User not found with username: " + username);
			//TEST Java
		}
		
	}

}
