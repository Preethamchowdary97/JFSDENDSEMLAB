package com.klef.jfsd.exam.model;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    private String title;
    private String author;
    private String genre;
    private Double price;
    private Integer publishedYear;

    // Getters and Setters
}
