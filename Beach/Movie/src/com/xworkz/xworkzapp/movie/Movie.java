package com.xworkz.xworkzapp.movie;

import java.util.Date;

public class Movie {
	public String producer;
	public String musicDirector;
	public Date releaseDate;

	public Movie(String producer, String musicDirector, Date releasDate) {
		this.producer = producer;
		this.musicDirector = musicDirector;
		releaseDate = releasDate;
	}

	public void enjoyWithFriend() {
		System.out.println("watching movies");
	}
}
