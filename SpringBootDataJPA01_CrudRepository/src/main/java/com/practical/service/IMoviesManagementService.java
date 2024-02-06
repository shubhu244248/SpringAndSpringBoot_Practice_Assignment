package com.practical.service;

import java.util.List;
import java.util.Optional;

import com.practical.entity.Movie;

public interface IMoviesManagementService {

	public String saveMovies(Movie movie);

	public Long fetchData();

	public Boolean checkMovieById(Integer id);

	public Iterable<Movie> getAllMovies();

	public Iterable<Movie> getAllMoviesById(List<Integer> id);

	public Movie getMovieById(Integer id);

	public Optional<Movie> getMovieByIdAnother(Integer id);

	public String groupMoviesRegistration(List<Movie> movies);

	public String updateMovieDetails(Integer movId, String movName, String movYear, Float movRating);

	public String updateMovie(Movie movie);
	
	public String deleteById(Integer id);
	
	public String deleteMovies(Movie movie);
	
	public String deleteAll();
	
	
}
