package com.imdb.restfulimdbservice.film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class FilmJpaResource {
	
	@Autowired
	private FilmRepository filmRepository;
	
	@GetMapping("/jpa/films")
	public List<Film> getAllFilms(){
		return filmRepository.findAll();
	}

}
