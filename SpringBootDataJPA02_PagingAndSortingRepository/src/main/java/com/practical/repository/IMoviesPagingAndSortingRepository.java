package com.practical.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.practical.entity.Movie;

@Repository
public interface IMoviesPagingAndSortingRepository extends PagingAndSortingRepository<Movie, Integer> {

}
