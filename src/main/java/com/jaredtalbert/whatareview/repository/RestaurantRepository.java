package com.jaredtalbert.whatareview.repository;

import com.jaredtalbert.whatareview.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
    List<Restaurant> findAll();

    Restaurant findRestaurantById(String id);

}
