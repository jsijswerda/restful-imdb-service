package com.imdb.restfulimdbservice.film;

import java.util.Date;
import java.util.List;

public class Film {
	
	private Integer id;
	private String name;
	private List<Person> listOfActors;
	private Person director;
	private Date yearOfPublication;
	
	
	protected Film() {}
	
	public Film(int id, String name, List<Person> listOfActors, Person director, Date yearOfPublication) {
		super();
		this.id = id;
		this.name = name;
		this.listOfActors = listOfActors;
		this.director = director;
		this.yearOfPublication = yearOfPublication;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
		return yearOfPublication;
	}
	public void setYearOfPublication(Date yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	@Override
	public String toString() {
		return String.format("Film [id=%s, name=%s, listOfActors=%s, director=%s, yearOfPublication=%s]", id, name,
				listOfActors, director, yearOfPublication);
	}
	
	

}
