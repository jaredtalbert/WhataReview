package com.jaredtalbert.whatareview.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("reviews")
public class Review {
    @Id
    private long Id;

    public Review(String author, String body, long restaurantId) {
        this.author = author;
        this.body = body;
        this.restaurantId = restaurantId;
    }

    private String author;
    private String body;
    private long restaurantId;

    public long getId() {
        return Id;
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public long getRestaurantId() {
        return restaurantId;
    }
}
