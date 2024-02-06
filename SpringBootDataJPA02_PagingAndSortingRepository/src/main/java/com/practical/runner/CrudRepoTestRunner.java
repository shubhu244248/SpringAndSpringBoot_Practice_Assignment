package com.practical.runner;

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
		// TODO Auto-generated method stub
		Iterable< Movie> iterable = service.findAllMoviesByOrder(true, "movName");
		System.out.print(iterable);
	}


}
