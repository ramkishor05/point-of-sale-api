package com.brijframework.authorization.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.authorization.model.EOUserProfile;

@Repository
@Transactional
public interface UserProfileRepository extends MongoRepository<EOUserProfile, Long>{

}
