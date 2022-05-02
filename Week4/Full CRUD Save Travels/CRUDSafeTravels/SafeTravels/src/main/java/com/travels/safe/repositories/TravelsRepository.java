package com.travels.safe.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travels.safe.models.Travel;

@Repository
public interface TravelsRepository extends CrudRepository<Travel, Long> {
	
	List<Travel> findAll();
}
