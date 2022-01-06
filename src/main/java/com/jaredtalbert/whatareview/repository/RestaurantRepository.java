package com.jaredtalbert.whatareview.repository;

import com.jaredtalbert.whatareview.model.Restaurant;
import com.jaredtalbert.whatareview.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface RestaurantRepository extends MongoRepository<Restaurant, Long> {
    List<Restaurant> findAll();

}
