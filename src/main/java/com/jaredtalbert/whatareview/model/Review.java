package com.jaredtalbert.whatareview.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("reviews")
public class Review {
    @Id
    private long Id;

    private String author;
    private String body;
}
