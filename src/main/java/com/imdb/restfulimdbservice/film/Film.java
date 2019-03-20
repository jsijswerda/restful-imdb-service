package com.imdb.restfulimdbservice.film;

import java.util.Date;
import java.util.List;

public class Film {
	
	private long id;
	private String name;
	private List<Person> listOfActors;
	private Person director;
	private Date YearOfPublication;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getActors() {
		return listOfActors;
	}
	public void setActors(List<Person> actors) {
		this.listOfActors = actors;
	}
	public Person getDirector() {
		return director;
	}
	public void setDirector(Person director) {
		this.director = director;
	}
	public Date getYearOfPublication() {
		return YearOfPublication;
	}
	public void setYearOfPublication(Date yearOfPublication) {
		YearOfPublication = yearOfPublication;
	}

}
