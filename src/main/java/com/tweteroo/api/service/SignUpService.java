package com.tweteroo.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.api.DTO.SignUpDTO;
import com.tweteroo.api.Repository.SignUpRepository;
import com.tweteroo.api.model.Person;

@Service
public class SignUpService {

	@Autowired
	SignUpRepository repository;

	public void save(SignUpDTO dto) {
		repository.save(new Person(dto));
	}
}
