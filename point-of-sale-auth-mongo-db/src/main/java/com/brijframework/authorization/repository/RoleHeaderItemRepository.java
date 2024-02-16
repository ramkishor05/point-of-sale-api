package com.brijframework.authorization.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.authorization.model.headers.EORoleHeaderItem;

@Repository
@Transactional
public interface RoleHeaderItemRepository  extends MongoRepository<EORoleHeaderItem, Long>{

	@Query(value="select * from ROLE_HEADER_ITEM URE where URE.ROLE_ID = :roleId and URE.HEADER_ITEM_ID=:headerId ")
	Optional<EORoleHeaderItem> findByRoleIdAndEndpointId(@Param("roleId")Long roleId, @Param("headerId") Long headerId);

	@Query(value="select * from ROLE_HEADER_ITEM URE where URE.ROLE_ID+'_'+URE.HEADER_ITEM_ID in (:roleheaders) ")
	List<EORoleHeaderItem> findByRoleEndpoints(@Param("roleheaders") List<String> roleheaders);

	@Query(value="select * from ROLE_HEADER_ITEM URE where URE.ROLE_ID =?1")
	List<EORoleHeaderItem>  findAllByRoleId(Long roleId);

	@Query(value="select * from ROLE_HEADER_ITEM URE where URE.TYPE_ID =?1")
	List<EORoleHeaderItem>  findAllByType(String roleId);
}
