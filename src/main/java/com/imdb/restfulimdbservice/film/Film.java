package com.imdb.restfulimdbservice.film;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Film {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	@ManyToMany(fetch=FetchType.LAZY)
	private List<Person> listOfActors;
	
	@OneToOne(fetch=FetchType.LAZY)
	private Person director;
	private Date yearOfPublication;
	
	
	protected Film() {}
	
	public Film(String name, List<Person> listOfActors, Person director, Date yearOfPublication) {
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
