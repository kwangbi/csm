package com.facroty.scm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AddressContorller {

	@GetMapping("/hello")
	public String getTeamHello() {
		return "Welcome To AMF Team";
	}
}
