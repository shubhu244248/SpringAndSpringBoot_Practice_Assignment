package com.practical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practical.entity.Movie;
import com.practical.repository.IMoviesRepository;

@Service
public class MoviesManagementServiceImpl  implements IMoviesManagementService{

	@Autowired
	private IMoviesRepository moviesRepository;
	@Override
	public String saveMovies(Movie movie) {
		// TODO Auto-generated method stub
		moviesRepository.save(movie);
		return "New Movie is Added";
	}

}
