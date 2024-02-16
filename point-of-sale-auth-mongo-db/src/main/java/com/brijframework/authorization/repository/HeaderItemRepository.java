package com.brijframework.authorization.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.authorization.model.headers.EOHeaderItem;

@Repository
@Transactional
public interface HeaderItemRepository  extends MongoRepository<EOHeaderItem, Long>{

	@Query(value="select * from HEADER_ITEM HI where HI.TITLE = :title")
	Optional<EOHeaderItem> findByTitle(@Param("title")String title);
	
	@Query(value="select * from HEADER_ITEM HI where HI.URL = :url")
	Optional<EOHeaderItem> findByUrl(@Param("url")String url);

	@Query(value="select * from HEADER_ITEM HI where HI.TYPE = :type")
	List<EOHeaderItem> findAllByType(@Param("type")String type);

	@Query(value="select * from HEADER_ITEM HI where HI.URL in (:urls)")
	List<EOHeaderItem> findByUrls(@Param("urls")List<String> urls);

}
