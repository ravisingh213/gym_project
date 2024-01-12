package com.QueCode.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QueCode.Entity.User;
import com.QueCode.Service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserService userService;
	// http://localhost:6395/home/users
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		System.out.println("this is api");
		return userService.getUsers();
		
	}
	
	@GetMapping("/current_user")
	public String current_user(Principal principal) {
		
		 
		return  principal.getName();
		
		
	}

}
