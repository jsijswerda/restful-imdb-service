package com.imdb.restfulimdbservice.film;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
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
	private Integer id;
	@NonNull private String name;
	@NonNull @ManyToMany(fetch=FetchType.LAZY)
	private List<Person> listOfActors;
	
	@OneToOne(fetch=FetchType.LAZY)
	@NonNull private Person director;
	@NonNull private Date yearOfPublication;
	
	




	
	

}
