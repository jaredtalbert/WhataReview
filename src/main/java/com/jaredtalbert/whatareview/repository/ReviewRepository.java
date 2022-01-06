package com.jaredtalbert.whatareview.repository;

import com.jaredtalbert.whatareview.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewRepository extends MongoRepository<Review, Long> {
    List<Review> findReviewByRestaurantId(Long id);

}
