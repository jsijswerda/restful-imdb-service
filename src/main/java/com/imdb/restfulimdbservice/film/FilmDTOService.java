package com.imdb.restfulimdbservice.film;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.imdb.restfulimdbservice.film.Film;

@Service
public class FilmDTOService {

	private static List<Film> films = new ArrayList<Film>();
	
	static {
		films.add(new Film(1,"Green Book", Arrays.asList(new Person("Viggo", "Mortesen")),new Person("Peter", "Farelly"), new Date()));
	}
	
	public List<Film> getAllFilms(){
		return films;
	}
	

	}

