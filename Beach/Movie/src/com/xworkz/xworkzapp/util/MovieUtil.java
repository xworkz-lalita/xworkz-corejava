package com.xworkz.xworkzapp.util;

import java.sql.Date;

import com.xworkz.xworkzapp.movie.Om;

public class MovieUtil {

	public static void main(String[] args) {

		Om o = new Om("UpendraMovie", "Hamsalekha k", new Date(45));
		System.out.println(o.producer+" "+o.musicDirector+" "+o.releaseDate);
		o.enjoy("gurukiran");
	}

}
