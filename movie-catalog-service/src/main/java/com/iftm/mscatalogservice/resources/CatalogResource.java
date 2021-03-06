package com.iftm.mscatalogservice.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.iftm.mscatalogservice.models.CatalogItem;
import com.iftm.mscatalogservice.models.Movie;
import com.iftm.mscatalogservice.models.Rating;

@RestController
@RequestMapping("/catalog")
public class CatalogResource {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId) {

		List<Rating> ratings = Arrays.asList(new Rating("12", 5), new Rating("15", 2), new Rating("10", 9));

		return ratings.stream().map(rating -> {
			Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
			return new CatalogItem(movie.getName(), "Filmão", rating.getRating());
		}).collect(Collectors.toList());

	}

}
