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

	@Override
	public Long fetchData() {
		Long countMovices = moviesRepository.count();
		return  countMovices;
	}

	@Override
	public Boolean checkMovieById(Integer id) {
		// TODO Auto-generated method stub
		return moviesRepository.existsById(id);
	}

	@Override
	public Iterable<Movie> getAllMovies() {
		// TODO Auto-generated method stub
		return moviesRepository.findAll();
	}

}
