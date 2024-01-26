package com.practical.repository;

//import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practical.entity.Movie;

@Repository
public interface IMoviesRepository extends CrudRepository<Movie, Integer> {

}
