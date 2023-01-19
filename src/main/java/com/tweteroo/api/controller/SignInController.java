package com.tweteroo.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.DTO.SignInDTO;

@RestController
@RequestMapping("/api/signin")
public class SignInController {

	@PostMapping
	public void create(@RequestBody SignInDTO req){
		System.out.println(req);
	}
}
