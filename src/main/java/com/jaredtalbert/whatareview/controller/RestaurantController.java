package com.jaredtalbert.whatareview.controller;

import com.jaredtalbert.whatareview.model.Restaurant;
import com.jaredtalbert.whatareview.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/places")
public class RestaurantController {

    @Autowired
    private RestaurantRepository repository;

    public RestaurantController(RestaurantRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<List<Restaurant>> getAllRestaurants() {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getRestaurantById(@PathVariable String id) {
        try {
            return new ResponseEntity<>(repository.findRestaurantById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/testAdd")
    public ResponseEntity<Restaurant> addRestaurantForTesting(@RequestBody Restaurant restaurant) {
        try {
            Restaurant newRestaurant = new Restaurant();
            newRestaurant.setAddress1(restaurant.getAddress1());
            newRestaurant.setAddress2(restaurant.getAddress2());
            newRestaurant.setZipCode(restaurant.getZipCode());
            repository.save(newRestaurant);
            return new ResponseEntity<>(newRestaurant, HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
