package com.brijframework.authorization.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.authorization.model.menus.EOMenuItem;

@Repository
@Transactional
public interface MenuItemRepository  extends MongoRepository<EOMenuItem, Long>{

	@Query(value="select * from MENU_ITEM UE where UE.TITLE = :title")
	Optional<EOMenuItem> findByTitle(@Param("title")String title);
	
	@Query(value="select * from MENU_ITEM UE where UE.URL = :url")
	Optional<EOMenuItem> findByUrl(@Param("url")String url);

	@Query(value="select * from MENU_ITEM UE where UE.TYPE = :type")
	List<EOMenuItem> findAllByType(@Param("type")String type);

	@Query(value="select * from MENU_ITEM UE where UE.URL in (:urls)")
	List<EOMenuItem> findByUrls(@Param("urls")List<String> urls);


}
