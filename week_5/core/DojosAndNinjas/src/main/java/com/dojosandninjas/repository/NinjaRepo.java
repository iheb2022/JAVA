package com.dojosandninjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dojosandninjas.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja,Long> {
	
	List<Ninja> findAll();
	List<Ninja> findAllByDojoId(Long dojo_id);
}
