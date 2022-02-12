package com.relevel.backend.tatasky.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TataskyController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

