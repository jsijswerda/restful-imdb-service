package com.imdb.restfulimdbservice.film;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Getter
@Setter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@RequiredArgsConstructor
@ToString(includeFieldNames=true)
public class Film {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull private String name;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@NonNull private List<Actor> listOfActors;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@NonNull private Director director;
	
	@NonNull @Past private Date yearOfPublication;


}
