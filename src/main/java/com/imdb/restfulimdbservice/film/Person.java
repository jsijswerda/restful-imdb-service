package com.imdb.restfulimdbservice.film;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AccessLevel;
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
public class Person {
	
	@Id	@GeneratedValue	private Integer id;
	@NonNull private String firstName;
	@NonNull private String lastName;
	
	
	


	
	

}
