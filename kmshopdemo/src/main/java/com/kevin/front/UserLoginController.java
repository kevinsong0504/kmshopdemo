package com.kevin.front;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller
public class UserLoginController {

	@RequestMapping("/login")
	public String login() {
		System.out.println("aaaaa");
		return "login";
	}
	@RequestMapping("/index")
	public String index() {
		return "login";
	}
}
