package com.imdb.restfulimdbservice.film;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity

@Getter
@Setter
@NoArgsConstructor(access=AccessLevel.PROTECTED)
@RequiredArgsConstructor
public class Film {
	
	@Id
	@GeneratedValue
	private Integer id;
	@NonNull private String name;
	@NonNull @ManyToMany(fetch=FetchType.LAZY)
	private List<Person> listOfActors;
	
	@OneToOne(fetch=FetchType.LAZY)
	@NonNull private Person director;
	
	@NonNull private Date yearOfPublication;
	
	
	
	
	
	



	@Override
	public String toString() {
		return String.format("Film [id=%s, name=%s, listOfActors=%s, director=%s, yearOfPublication=%s]", id, name,
				listOfActors, director, yearOfPublication);
	}



	
	

}
