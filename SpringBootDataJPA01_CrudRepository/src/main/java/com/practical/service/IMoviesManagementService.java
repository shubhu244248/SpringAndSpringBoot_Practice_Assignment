package com.practical.service;

import org.springframework.stereotype.Service;

import com.practical.entity.Movie;

@Service
public interface IMoviesManagementService {
	
	public String saveMovies(Movie movie);

	public Long fetchData();
}
