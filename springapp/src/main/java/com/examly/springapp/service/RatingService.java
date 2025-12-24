package com.examly.springapp.service;

import java.util.List;
import com.examly.springapp.model.Rating;

public interface RatingService {

    Rating createRating(Rating rating);

    List<Rating> getAllRatings();

    Rating getRatingById(Long id);
}

