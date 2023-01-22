package com.tweteroo.api.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.model.Tweets;

public interface TweetsRepository extends JpaRepository<Tweets, Long> {
    List<Tweets> findByName(String name);
}
