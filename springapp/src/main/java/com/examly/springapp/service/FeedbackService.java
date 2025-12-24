
package com.examly.springapp.service;

import java.util.List;
import com.examly.springapp.model.Feedback;

public interface FeedbackService {

    Feedback createFeedback(Feedback feedback);

    List<Feedback> getAllFeedbacks();

    Feedback getFeedbackById(Long id);
}


