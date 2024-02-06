package com.practical.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practical.entity.Movie;
import com.practical.repository.IMoviesRepository;

import jakarta.persistence.criteria.CriteriaBuilder.In;

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

		return opt.isEmpty() ? Optional.empty() : opt;
	}

	@Override
	public String groupMoviesRegistration(List<Movie> movies) {
		// TODO Auto-generated method stub
		Iterable<Movie> savedMovies = moviesRepository.saveAll(movies);
		List<Integer> listIds = new ArrayList<Integer>();
		if (savedMovies != null && ((List<Movie>) savedMovies).size() > 0) {
			savedMovies.forEach(m -> {
				listIds.add(m.getMovId());
			});
		}
		return listIds.toString() + "Movies are saved";
	}

	@Override
	public String updateMovieDetails(Integer movId, String movName, String movYear, Float movRating) {
		// TODO Auto-generated method stub
		Optional<Movie> opt = moviesRepository.findById(movId);
		if (opt.isPresent()) {
			Movie movie = opt.get();
			movie.setMovName(movName);
			movie.setMovYear(movYear);
			movie.setMovRating(movRating);
			return "Details updated";
		} else {
			return "Movie not found";
		}
	}

	/*@Override
	public String updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		moviesRepository.save(movie);
		return "Movie Updated";
	}*/

	@Override
	public String updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		Optional<Movie> opt = moviesRepository.findById(movie.getMovId());
		if (opt.isPresent()) {
			moviesRepository.save(movie);
			return "Details updated";
		} else {
			return "Movie not found";
		}
	}

	@Override
	public String deleteById(Integer id) {
		// TODO Auto-generated method stub
		Movie movie = moviesRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Movie not found"));

		moviesRepository.deleteById(id);

		return "Record Deleted";
	}

	/*@Override
	public String deleteMovies(Movie movie) {
		// TODO Auto-generated method stub
		moviesRepository.delete(movie);
		return "Record Deleted";
	}*/

	@Override
	public String deleteMovies(Movie movie) {
		// TODO Auto-generated method stub
		Optional<Movie> opt = moviesRepository.findById(movie.getMovId());
		if (opt.isPresent()) {
			moviesRepository.delete(movie);
			return "Record Deleted";
		} else {
			return "Record not found";
		}

	}

	@Override
	public String deleteAll() {
		// TODO Auto-generated method stub
		long count = moviesRepository.count();
		if(count != 0) {
			moviesRepository.deleteAll();
			return count+" no.of records are deleted";
		} else {
			return "their is no record";
		}
		
	}
}
