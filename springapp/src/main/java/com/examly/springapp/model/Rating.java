package com.examly.springapp.model;

import jakarta.persistence.*;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ratingId;

    private Integer score;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;

    public Rating() {}

    // Getters and Setters
    public Long getRatingId() { return ratingId; }
    public void setRatingId(Long ratingId) { this.ratingId = ratingId; }

    public Integer getScore() { return score; }
    public void setScore(Integer score) { this.score = score; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
}