package com.coolwen.springbootshiro.controller;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class HelloController {

	@RequestMapping("/test")
	@RequiresRoles("Admin")
	public String hello() {
		return "redirect:/login";
	}
}
