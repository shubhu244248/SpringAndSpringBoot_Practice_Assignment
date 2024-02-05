package com.practical.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practical.entity.Movie;
import com.practical.repository.IMoviesRepository;

@Service
public class MoviesManagementServiceImpl implements IMoviesManagementService {

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
		return countMovices;
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

	@Override
	public Iterable<Movie> getAllMoviesById(List<Integer> id) {
		// TODO Auto-generated method stubOO
		return moviesRepository.findAllById(id);
	}

	@Override
	public Movie getMovieById(Integer id) {
		// TODO Auto-generated method stub
		return moviesRepository.findById(id).orElse(new Movie());
	}

	

	/*@Override
	public Movie getMovieById(Integer id) {
		// TODO Auto-generated method stub
		return moviesRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Record not found " + id));
	}*/

	
	
	/*@Override
	public Movie getMovieById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Movie> opt = moviesRepository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			throw new IllegalArgumentException("No record is their");
		}
	}*/

	
	@Override
	public Optional<Movie> getMovieByIdAnother(Integer id) {
		// TODO Auto-generated method stub
		Optional<Movie> opt = moviesRepository.findById(id);
		
		return opt.isEmpty() ? Optional.empty():opt;
	}
}
