package com.imdb.restfulimdbservice.film;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class FilmJpaResource {
	
	@Autowired
	private FilmRepository filmRepository;
	
	@GetMapping("/jpa/films")
	public List<Film> getAllFilms(){
		return filmRepository.findAll();
	}
	
	@GetMapping("/jpa/films/{id}")
	public Film getOneFilm(@PathVariable int id) {
		Optional<Film> film = filmRepository.findById(id);
		
		if (!film.isPresent())
			throw new FilmNotFoundException("id = " + id);
		
		return film.get();
	}

}
