package com.imdb.restfulimdbservice.film;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.imdb.restfulimdbservice.film.Film;

@Component
public class FilmDTOService {

	private static List<Film> films;
	
	
	
	public List<Film> getAllFilms(){
		return films;
	}
	

	}

