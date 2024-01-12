package com.QueCode.Confiq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.QueCode.Security.JwtAuthenticationEntrypoint;
import com.QueCode.Security.JwtAuthenticationFilter;

@Configuration
public class SecurityConfiq {
	@Autowired
	private JwtAuthenticationEntrypoint point;
	@Autowired
	private JwtAuthenticationFilter filter;
	@Autowired private UserDetailsService userDetailsService;
	
	@Autowired private PasswordEncoder passwordEncoder;
	

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(csrf -> csrf.disable()).cors(cors -> cors.disable())
				.authorizeRequests(auth -> auth.requestMatchers("/home/**").authenticated()
						.requestMatchers("/auth/login").permitAll().requestMatchers("/auth/createUser").permitAll().anyRequest().authenticated())
				.exceptionHandling(ex -> ex.authenticationEntryPoint(point))
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

		return http.build();
	}
	
	@Bean
	public DaoAuthenticationProvider daoAuththenticationProvider() {
		
		DaoAuthenticationProvider pv =new DaoAuthenticationProvider();
		pv.setUserDetailsService(userDetailsService);
		pv.setPasswordEncoder(passwordEncoder);
		return pv;
	}

}
