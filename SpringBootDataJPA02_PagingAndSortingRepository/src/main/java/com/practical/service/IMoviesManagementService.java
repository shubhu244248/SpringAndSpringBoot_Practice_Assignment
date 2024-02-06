package com.practical.service;

import com.practical.entity.Movie;

public interface IMoviesManagementService {

	
	public Iterable<Movie> findAllMoviesByOrder(boolean acs, String...properties);
}
