package com.brijframework.authorization.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.authorization.model.EOUserAccount;

@Repository
@Transactional
public interface UserAccountRepository  extends MongoRepository<EOUserAccount, Long>{

	@Query(value="select * from USER_ACCOUNT UA where UA.USERNAME = :username")
	Optional<EOUserAccount> findUserName(@Param("username")String username);

	@Query(value="select * from USER_ACCOUNT UA where UA.OWNER_ID = :ownerId")
	List<EOUserAccount> findAllByOwnerId(Long ownerId);
	
	@Query(value="select * from USER_ACCOUNT UA INNER JOIN USER_ROLE UR ON UR.ID=UA.ROLE_ID  where UA.OWNER_ID = :ownerId AND UR.ROLE_TYPE = :roleType ")
	List<EOUserAccount> findAllByOwnerIdAndRoleType(Long ownerId, String roleType);

}
