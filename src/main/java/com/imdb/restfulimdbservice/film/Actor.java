package com.imdb.restfulimdbservice.film;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
@Entity
@Getter
@Setter
@DiscriminatorColumn(name="type")
@DiscriminatorValue(value="actor")
public class Actor extends Person {

	@ManyToMany(fetch=FetchType.LAZY)
	@JsonIgnore
	@NonNull private List<Film> listOfFilms;
	
	protected Actor() {}

	public Actor(String firstName, String lastName, @NonNull List<Film> listOfFilms) {
		super(firstName, lastName);
		this.listOfFilms = listOfFilms;
	}
	
	
}
