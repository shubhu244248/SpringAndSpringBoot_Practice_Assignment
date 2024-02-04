package com.practical.service;


import java.util.List;

import com.practical.entity.Movie;


public interface IMoviesManagementService {
	
	public String saveMovies(Movie movie);

	public Long fetchData();
	
	public Boolean checkMovieById(Integer id);
	
	public Iterable<Movie> getAllMovies();
	
	public Iterable<Movie> getAllMoviesById(List<Integer> id);
}
