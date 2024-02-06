package com.practical.entity;

import java.io.Serializable;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "movies_data")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Movie implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movId;
	private String movName;
	private String movYear;
	private Float movRating;
	
	public Movie(String movName, String movYear, Float movRating) {
		super();
		this.movName = movName;
		this.movYear = movYear;
		this.movRating = movRating;
	}
}
