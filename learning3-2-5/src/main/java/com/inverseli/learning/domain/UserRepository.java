package com.inverseli.learning.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {

	User findByUsername(String username);

}
