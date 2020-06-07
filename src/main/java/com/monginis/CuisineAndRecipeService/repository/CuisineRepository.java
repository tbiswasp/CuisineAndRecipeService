package com.monginis.CuisineAndRecipeService.repository;

import com.monginis.CuisineAndRecipeService.model.Cuisine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuisineRepository extends CrudRepository<Cuisine, Long>{}
