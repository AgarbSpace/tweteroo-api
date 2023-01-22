package com.tweteroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.DTO.SignUpDTO;
import com.tweteroo.api.service.SignUpService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/sign-up")
public class SignUpController {

	@Autowired
	private SignUpService service;

	@PostMapping
	public String signUp(@RequestBody SignUpDTO req){
		service.save(req);
		return "ok";
	}
}
