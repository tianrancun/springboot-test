package com.test.dao.cosmosdb;

import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;
import com.test.model.cosmosdb.TireSize;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TireSizeRepository extends DocumentDbRepository<TireSize, String> {

	List<TireSize> findByWidth(String width);
	
}

