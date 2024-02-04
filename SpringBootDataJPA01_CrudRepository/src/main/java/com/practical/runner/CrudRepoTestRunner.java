package com.practical.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.practical.entity.Movie;
import com.practical.service.IMoviesManagementService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner{

	@Autowired
	private IMoviesManagementService service;
	
	@Override
	public void run(String... args) throws Exception {
		Movie movie = new Movie();
		
		/*movie.setMovId(1002);
		movie.setMovName("Aspirant");
		movie.setMovYear("2019");
		movie.setMovRating(4.5f);
		try {
			System.out.println(service.saveMovies(movie));
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		
		/*	try {
				System.out.println("Movie Count"+service.fetchData());
			} catch (Exception e) {
				e.printStackTrace();
			}*/
		
		/*try {
			System.out.println("Movie is Exist or Not : "+service.checkMovieById(3));
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		/*	
			try {
				Iterable<Movie> moviesList = service.getAllMovies();
				for(Movie movie2 : moviesList ) {
					System.out.println(movie2);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			*/
		try {
			Iterable<Movie> moviesList = service.getAllMovies();
			for(Movie movie2 : moviesList ) {
				System.out.println(movie2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
