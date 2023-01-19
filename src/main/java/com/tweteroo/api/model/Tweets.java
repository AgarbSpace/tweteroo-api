package com.tweteroo.api.model;


import com.tweteroo.api.DTO.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweets {
  
	public Tweets(TweetDTO data) {
		this.name = data.name();
		this.tweet = data.tweet();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(length = 50, nullable = false)
	private String name;

	@Column(length = 200, nullable = false)
	private String tweet;
}
