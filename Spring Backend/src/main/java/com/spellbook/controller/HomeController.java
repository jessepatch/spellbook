package com.spellbook.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

	@RequestMapping(value = "/")
	public Object getLoginPage() {
		return null;
	}
	
	@RequestMapping(value = "home")
	public Object getHomePage() {
		return null;
	}
}
