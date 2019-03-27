package com.imdb.restfulimdbservice.film;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
@Entity
@Getter
@Setter
@DiscriminatorValue(value="Director")
public class Director extends Person {

	@OneToMany(fetch=FetchType.LAZY, mappedBy="director")
	@JsonIgnore
	
	@NonNull private List<Film> listOfFilms;
	
	protected Director() {}

	public Director(String firstName, String lastName, @NonNull List<Film> listOfFilms) {
		super(firstName, lastName);
		this.listOfFilms = listOfFilms;
	}
	
	
}
