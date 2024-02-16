package com.brijframework.authorization.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.authorization.model.EOUserRole;

@Repository
@Transactional
public interface UserRoleRepository  extends MongoRepository<EOUserRole, Long>{

	EOUserRole findByRoleName(String role);
	
	Optional<EOUserRole> findByPosition(int position);

	List<EOUserRole> findAllByRoleType(String type);

	@Query(value="Select * from USER_ROLE UR where UR.POSITION in (?1)")
	List<EOUserRole> findByPositions(List<Integer> positions);

}
