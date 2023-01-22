package com.tweteroo.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.tweteroo.api.DTO.TweetDTO;
import com.tweteroo.api.Repository.TweetsRepository;
import com.tweteroo.api.model.Tweets;

@Service
public class TweetsService {
  
	@Autowired
	TweetsRepository repository;

	public Page<Tweets> findAll(String page) {
		int pageNumber = Integer.parseInt(page);
		int size = 5;

		PageRequest pageRequest = PageRequest.of(pageNumber, size);

		return new PageImpl<>(
				repository.findAll(),
				pageRequest, size);
	}

	public List<Tweets> findByName(String username) {
		return repository.findByName(username);
	}

	public void save(TweetDTO dto) {
		repository.save(new Tweets(dto));
	}

}
