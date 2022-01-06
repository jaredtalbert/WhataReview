package com.jaredtalbert.whatareview.controller;

import com.jaredtalbert.whatareview.model.Restaurant;
import com.jaredtalbert.whatareview.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/places")
public class RestaurantController {

//    @Autowired
    private final RestaurantRepository repository;

    public RestaurantController(RestaurantRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) throws Exception {
        return repository.findById(id).orElseThrow(Exception::new);
    }
}
