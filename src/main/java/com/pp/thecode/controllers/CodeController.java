package com.pp.thecode.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class CodeController {
	@RequestMapping("/")
	public String index() {
		return "/TheCode/index.jsp";
	}

}
