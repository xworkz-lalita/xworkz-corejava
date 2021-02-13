package com.xworkz.solution.dto;

import java.util.Date;

public class MovieDTO {
	private String name;
	private double rating;
	private double duration;
	private String genre;
	private Date date;

	public MovieDTO() {


	}


	/**
	 * @param name
	 * @param rating
	 * @param duration
	 * @param genre
	 * @param date
	 */
	public MovieDTO(String name, double rating, double duration, String genre, Date date) {
		super();
		this.name = name;
		this.rating = rating;
		this.duration = duration;
		this.genre = genre;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	

}
