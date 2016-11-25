package me.gacl.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service(value="myUserDetailService")
public class MyUserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {

		Collection<GrantedAuthority> auths = null;
		
		SimpleGrantedAuthority auth2=new SimpleGrantedAuthority("ROLE_ADMIN");   
		SimpleGrantedAuthority auth1=new SimpleGrantedAuthority("ROLE_USER");   
		
		if(username.equals("zlp")){   
            auths=new ArrayList<GrantedAuthority>();   
            auths.add(auth1);  
            auths.add(auth2);        
        }   
		
		User user = new User(username, "zlp", true, true, true, true, auths);
		return user;
	}

}
