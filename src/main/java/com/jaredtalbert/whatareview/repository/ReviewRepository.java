package com.jaredtalbert.whatareview.repository;

import com.jaredtalbert.whatareview.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {
    List<Review> findReviewByRestaurantId(String id);

}
