package com.imdb.restfulimdbservice.film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilmResource {
	
	@Autowired
	private FilmDAOService service;
	
	@GetMapping("/films")
	public List<Film> getFilms(){
		return service.getAllFilms(); 
	}
	

			

}
