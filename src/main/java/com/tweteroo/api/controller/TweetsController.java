package com.tweteroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.DTO.TweetDTO;
import com.tweteroo.api.Repository.TweetsRepository;
import com.tweteroo.api.model.Tweets;

@RestController
@RequestMapping("/api/tweets")
public class TweetsController {
  
	@Autowired
	private TweetsRepository repository;

	@PostMapping
	public String postTweet(@RequestBody TweetDTO req) {
		repository.save(new Tweets(req));
		return "ok";
	}
}
