package com.imdb.restfulimdbservice.film;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
@Entity
@Getter
@Setter
@DiscriminatorValue(value = "Actor")
public class Actor extends Person {

	@ManyToMany
	@JoinTable(
			name="actor_in_film",
			joinColumns= @JoinColumn(name="actor_id"),
			inverseJoinColumns=@JoinColumn(name="film_id"))
	
	@JsonIgnore
	@NonNull private List<Film> listOfFilms;
	
	protected Actor() {}

	public Actor(String firstName, String lastName, @NonNull List<Film> listOfFilms) {
		super(firstName, lastName);
		this.listOfFilms = listOfFilms;
	}
	
	
}
