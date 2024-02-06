package com.practical.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practical.entity.Movie;
import com.practical.service.IMoviesManagementService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner {

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

		/*try {
			Iterable<Movie> moviesList = service.getAllMovies();
			for(Movie movie2 : moviesList ) {
				System.out.println(movie2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			
			System.out.println("Movie detailed : "+service.getMovieById(2));
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*	try {
		
				Optional<?> opt = service.getMovieByIdAnother(2);
				if(!opt.isEmpty()) {
					System.out.println("Movies Details : "+opt.get());
				} else {
					System.out.println("Record not found");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}*/

		/*try {
		
			String result = service.groupMoviesRegistration(
					List.of(new Movie("12th failed", "2023", 5.0f), new Movie("Cubicles", "2020", 5.0f)));
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/

		/*try {
			movie = new Movie(1, "Jamtara", "2005", 5.0f);
			String result = service.saveMovies(movie);
			System.out.println(result);
		
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			
			System.out.println(service.deleteById(4));
		
		} catch (Exception e) {
			e.printStackTrace();
		}*/

		try {
			
			movie.setMovId(3);
			System.out.println(service.deleteMovies(movie));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
