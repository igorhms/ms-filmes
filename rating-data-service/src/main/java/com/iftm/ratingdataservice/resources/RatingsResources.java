package com.iftm.ratingdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.ratingdataservice.models.Rating;

@RestController
@RequestMapping("ratingsdata")
public class RatingsResources {

	@RequestMapping("{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId, 4);
	}
}
