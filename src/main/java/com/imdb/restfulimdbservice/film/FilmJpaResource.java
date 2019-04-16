package com.imdb.restfulimdbservice.film;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmJpaResource {
	
	@Autowired
	private FilmRepository filmRepository;
	
	@GetMapping("/jpa/films")
	public List<Film> getAllFilms(){
		return filmRepository.findAll();
	}
	
	@GetMapping("/jpa/films/{id}")
	public Film getOneFilm(@PathVariable long id) {
		Optional<Film> film = filmRepository.findById(id);
		
		if (!film.isPresent())
			throw new FilmNotFoundException("id = " + id);
		
		return film.get();
	}
	
	@PostMapping("/jpa/films")
	public Film save(@Valid @RequestBody Film film) {
		Film savedfilm = filmRepository.save(film);
		return savedfilm;
	}
	


}
