package com.practical.service;


import com.practical.entity.Movie;


public interface IMoviesManagementService {
	
	public String saveMovies(Movie movie);

	public Long fetchData();
	
	public Boolean checkMovieById(Integer id);
	
	public Iterable<Movie> getAllMovies();
}
