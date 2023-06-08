package com.cinema.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cinema.Entity.Movie;
import com.cinema.Repository.MovieRepository;

@Repository
public class MovieDao {
	@Autowired
	MovieRepository movieRepo;
	public String moviedet(List<Movie>a) {
		movieRepo.saveAll(a);
		return "save successfully";
		
	}

}
