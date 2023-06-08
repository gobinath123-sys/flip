package com.cinema.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.Dao.MovieDao;
import com.cinema.Entity.Movie;

@Service
public class MovieService {
	@Autowired
	MovieDao movieDao;
	
	public String moviedet(List<Movie>a) {
		return movieDao.moviedet(a);
	}
	

}
