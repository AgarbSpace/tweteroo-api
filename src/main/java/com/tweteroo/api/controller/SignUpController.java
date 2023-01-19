package com.tweteroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.DTO.SignUpDTO;
import com.tweteroo.api.Repository.SignUpRepository;
import com.tweteroo.api.model.Person;

@RestController
@RequestMapping("/api/sign-up")
public class SignUpController {

	@Autowired
	private SignUpRepository repository;

	@PostMapping
	public String signUp(@RequestBody SignUpDTO req){
		repository.save(new Person(req));
		return "ok";
	}
}
