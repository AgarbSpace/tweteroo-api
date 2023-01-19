package com.tweteroo.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.api.model.Person;

public interface SignUpRepository extends JpaRepository<Person, Long> {
  
}
