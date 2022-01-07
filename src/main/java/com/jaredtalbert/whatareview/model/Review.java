package com.jaredtalbert.whatareview.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("reviews")
public class Review {

    @Id
    private String Id;

    public Review(String author, String body, String restaurantId) {
        this.author = author;
        this.body = body;
        this.restaurantId = restaurantId;
    }

    private String author;
    private String body;
    private String restaurantId;

    public String getId() {
        return Id;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public String getRestaurantId() {
        return restaurantId;
    }
}
