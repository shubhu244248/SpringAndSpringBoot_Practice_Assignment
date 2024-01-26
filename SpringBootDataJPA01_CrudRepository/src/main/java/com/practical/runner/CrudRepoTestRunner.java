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
//		
////		movie.setMovId(1001);
//		movie.setMovName("3 Idiots");
//		movie.setMovYear("2003");
//		movie.setMovRating(5.0f);
//		try {
//			System.out.println(service.saveMovies(movie));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		System.out.println(service.fetchData());
		
	}

}
