package com.example.eatgo.application;

import com.example.eatgo.domain.Review;
import com.example.eatgo.domain.ReviewRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

public class ReviewServiceTests {

    private ReviewService reviewService;

    @Mock
    private ReviewRepository reviewRepository;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);

        reviewService = new ReviewService(reviewRepository);
    }

    @Test
    public void addReview(){
        Review review = Review.builder()
                .name("JOKER")
                .score(3)
                .description("masitda")
                .build();

        reviewService.addReview(review);

        verify(reviewRepository).save(any());
    }
}