package com.riis.app.security;

import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.riis.app.UserService;


@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter{
private final UserService userDetailsService;
//would add encryption here

public WebSecurity(UserService userDetailsService) {
	this.userDetailsService=userDetailsService;
}
@Override
protected void configure(HttpSecurity http)throws Exception{
	http.csrf().disable().authorizeRequests().antMatchers(HttpMethod.POST, SecurityConstants.SIGN_UP_URL).permitAll().anyRequest().authenticated();
}
@Override
public void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.userDetailsService(userDetailsService);
	//would need to configure encryption here
}
}
