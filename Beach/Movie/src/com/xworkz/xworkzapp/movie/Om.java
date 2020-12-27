package com.xworkz.xworkzapp.movie;

import java.util.Date;

public class Om extends Movie {

	public Om(String producer, String musicDirector, Date releaseDate) {
		super(producer, musicDirector, releaseDate);

	}

	public void enjoy(String musicDirector) {
		System.out.println("beginning of movie");
		super.musicDirector = musicDirector;
		System.out.println(musicDirector);
		super.enjoyWithFriend();
		System.out.println("end of movie");
	}

	{
		String producer = "Upendra";
		String musicDirector = "Hamsalekha";
		Date releaseDate = new Date();
		super.producer = producer;
		super.musicDirector = musicDirector;
		super.releaseDate = releaseDate;
		System.out.println(producer);
		System.out.println(musicDirector);
		System.out.println(releaseDate);

	}

}
