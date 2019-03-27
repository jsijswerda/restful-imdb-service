package com.imdb.restfulimdbservice.film;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@DiscriminatorColumn(name="type", discriminatorType=DiscriminatorType.STRING)

public abstract class Person {
	
	@Id	@GeneratedValue	private Long personId;
	@NonNull private String firstName;
	@NonNull private String lastName;
	


	
}
