package com.practical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.practical.entity.Movie;
import com.practical.repository.IMoviesPagingAndSortingRepository;

@Service
public class MoviesManagementServiceImpl implements IMoviesManagementService {

	@Autowired
	private IMoviesPagingAndSortingRepository pagingAndSortingRepository;

	@Override
	public Iterable<Movie> findAllMoviesByOrder(boolean acs, String... properties) {  // Var args intenarlly array
		// TODO Auto-generated method stub
		Sort sort = Sort.by(acs?Direction.ASC:Direction.DESC,properties);
		return pagingAndSortingRepository.findAll(sort);
	}

}
