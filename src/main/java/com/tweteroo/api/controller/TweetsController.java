package com.tweteroo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.DTO.TweetDTO;
import com.tweteroo.api.model.Tweets;
import com.tweteroo.api.service.TweetsService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tweets")
public class TweetsController {
  
	@Autowired
	private TweetsService service;

	@GetMapping
	public Page<Tweets> listAll(@RequestParam String page, Pageable pageable) {
		return service.findAll(page);
	}

	@GetMapping("/{username}")
	public List<Tweets> findByName(@PathVariable String username) {
		return service.findByName(username);
	}


	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public String postTweet(@RequestBody TweetDTO req) {
		service.save(req);
		return "ok";
	}
}
