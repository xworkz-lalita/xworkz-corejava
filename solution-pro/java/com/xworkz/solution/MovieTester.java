package com.xworkz.solution;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import com.xworkz.solution.dto.MovieDTO;

public class MovieTester {
	public static void main(String[] args) {	
		    Calendar date1 = new GregorianCalendar();
		    Calendar date2 = (Calendar)date1.clone();
		    date2.add(Calendar.DATE, -8500);
		    
		 
MovieDTO dto=new  MovieDTO("KGF", 5.0, 3.0, "Action" , new SimpleDateFormat("dd-MM-yyyy"));
	    

		/*
		 * MovieDTO dto1 = new MovieDTO("KGF", 5.0, 3.0, "Action" ); MovieDTO dto2 = new
		 * MovieDTO("Om", 5, 2.5, "Drama"); MovieDTO dto3 = new MovieDTO("Bahubhali",
		 * 4.5, 2.39, "Action/War" ); MovieDTO dto4 = new MovieDTO("Andhra Wala", 5, 3,
		 * "Action"); MovieDTO dto5 = new MovieDTO("Tarle nan maga", 5, 3, "Comedy");
		 * MovieDTO dto6 = new MovieDTO("kal nan maga", 2, 5, "Comedy"); //
		 */  MovieDTO dto7=new MovieDTO(); //
  MovieDTO dto8=new MovieDTO(); // MovieDTO dto9=new MovieDTO();
 
		Collection<MovieDTO> movies = new ArrayList<MovieDTO>();
		movies.add(dto);
		System.out.println(dto);
		/*
		 *
		 * movies.add(dto1); movies.add(dto2); movies.add(dto3); movies.add(dto4);
		 * movies.add(dto5); movies.add(dto6);
		 */
		/*
		 * movies.add(dto7); movies.add(dto8); movies.add(dto9);
		 * //dto6.setGenre("Fictional"); dto7.setGenre("War");
		 * dto8.setGenre("Fictional"); dto9.setGenre("Comedy");
		 */
		Collection<MovieDTO> mov = new ArrayList<MovieDTO>();
		Iterator<MovieDTO> iterator = movies.iterator();
		while (iterator.hasNext()) {
			MovieDTO it = iterator.next();
			if (it.getGenre().equals(mov)) {
				System.out.println("duplicates movies are nos are" + it);
			} else {
				System.out.println(mov.add(it));
			}

			/*
			 * if(it.getGenre().equals("Comedy")) { // movies.remove(it); it.setGenre(null);
			 * System.out.println("removing movie is"+it);
			 
			if (it.getGenre().equals("Comedy")) {
				movies.remove(it);
				// it.setGenre(null);
				System.out.println("removing movie is" + it);
			}
		}
		System.out.println("after removing one genre" + movies);
		System.out.println(movies.size());

	}*/
}}}