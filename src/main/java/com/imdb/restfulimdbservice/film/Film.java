package com.imdb.restfulimdbservice.film;

import java.time.Year;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Past;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Getter
@Setter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@RequiredArgsConstructor
@ToString(includeFieldNames=true)
public class Film {
	
	@Id
	@GeneratedValue
	private Long filmId;
	
	@NonNull private String name;
	
	@ManyToMany(mappedBy="listOfFilms")
	@NonNull private List<Actor> listOfActors;
	
	@ManyToOne
	@JoinColumn(name="director_id")
	@NonNull private Director director;
	
	
	@NonNull @Past private Year yearOfPublication;


}
