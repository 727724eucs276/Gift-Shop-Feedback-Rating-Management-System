package com.examly.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.model.Rating;
import com.examly.springapp.repository.RatingRepo;
import com.examly.springapp.service.RatingService;
@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepo.save(rating);
    }
 @Override
    public List<Rating> getAllRatings() {
        return ratingRepo.findAll();
    }

    @Override
    public Rating getRatingById(Long id) {
        return ratingRepo.findById(id).orElse(null);
    }
}





