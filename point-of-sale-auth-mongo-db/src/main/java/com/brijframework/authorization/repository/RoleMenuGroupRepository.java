package com.brijframework.authorization.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.authorization.model.menus.EORoleMenuGroup;

@Repository
@Transactional
public interface RoleMenuGroupRepository  extends MongoRepository<EORoleMenuGroup, Long>{

	@Query(value="select * from ROLE_MENU_GROUP URE where URE.USER_ROLE_ID =?1")
	List<EORoleMenuGroup>  findAllByRoleId(Long roleId);

	@Query(value="select * from ROLE_MENU_GROUP URE where URE.USER_ROLE_ID = :roleId and URE.MENU_GROUP_ID=:userEndpointId ")
	Optional<EORoleMenuGroup> findByRoleIdAndGroupId(@Param("roleId")Long roleId, @Param("userEndpointId") Long userEndpointId);

}
