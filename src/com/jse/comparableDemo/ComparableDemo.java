package com.jse.comparableDemo;

import java.util.ArrayList;
import java.util.Collections;


class ComparableDemo {
public static void main(String[] args) {
	
ArrayList<Movie> list = new ArrayList<Movie>();
	list.add(new Movie("Naruto",2010,8.9));
	list.add(new Movie("Naruto Shippuden",2012,5));
	list.add(new Movie("Death Note",2002,7));
	list.add(new Movie("Pokemon",2020,10));
	
	
	  System.out.println("Before Sorting");
	  //below print style gives you output	  the way you enter it means its not doing anything 
	  for(Movie movie:list) {
	  System.out.println(movie.getMovieName()+" "+movie.getMovieReleasedYear()+" "
	  +movie.getMovieRating()); }
	 
	  //without collections.sort method even though you implemented comparator will not work
	 System.out.println("\n\nAfter Sorting"); 
	 Collections.sort(list);
	for(Movie movie:list) {
		System.out.println(movie.getMovieRating()+" "+movie.getMovieName()+" "+movie.getMovieReleasedYear());
	}

	
}
}
