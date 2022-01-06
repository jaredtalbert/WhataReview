package com.jaredtalbert.whatareview.repository;

import com.jaredtalbert.whatareview.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RestaurantRepository extends MongoRepository<Restaurant, Long> {
}
