package com.jaredtalbert.whatareview.controller;

import com.jaredtalbert.whatareview.model.Review;
import com.jaredtalbert.whatareview.repository.ReviewRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/places/{id}/reviews")
public class ReviewController {

    ReviewRepository reviewRepository;

    public ReviewController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @GetMapping
    public ResponseEntity<List<Review>> getReviewsForStore(@PathVariable("id") String id) {
        try {
            return new ResponseEntity<>(reviewRepository.findReviewByRestaurantId(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Review> createReview(@PathVariable("id") String id, @RequestBody Review review) {
        try {
            Review newReview = reviewRepository.save(new Review(review.getAuthor(), review.getBody(), id));
            return new ResponseEntity<>(newReview, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
