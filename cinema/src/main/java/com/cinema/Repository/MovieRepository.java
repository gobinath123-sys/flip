package com.cinema.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.Entity.Movie;



public interface MovieRepository extends JpaRepository<Movie,Integer>{

}
