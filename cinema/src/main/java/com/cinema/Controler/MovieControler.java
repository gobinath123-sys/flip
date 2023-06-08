package com.cinema.Controler;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.Entity.Movie;
import com.cinema.Service.MovieService;

@RestController
public class MovieControler {
@Autowired
MovieService movieSer;
@PutMapping(value="/moviedet")
public String moviedet(@RequestBody List<Movie>a) {
	return movieSer.moviedet(a);
}

}
