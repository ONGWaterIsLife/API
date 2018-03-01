package com.waterislife.api.repository;

import com.waterislife.api.domain.Filter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FilterRepository extends MongoRepository<Filter, String> {
}
