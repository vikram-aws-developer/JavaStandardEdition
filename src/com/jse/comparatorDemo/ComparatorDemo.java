package com.jse.comparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		
		List<Movie> list = new ArrayList<Movie>();
		
		list.add(new Movie(2000,"APPLE",5.5));
		list.add(new Movie(2012,"BAT",6.5));
		list.add(new Movie(2020,"XYZ",8.0));
		list.add(new Movie(1991,"Zcanvos",9.0));
		
		//sort by rating		
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list,ratingCompare);
		
		for(Movie movie:list){
			System.out.println(movie.getMovieRating()+"  "+movie.getMovieName()+"  "+movie.getMovieReleaseYear());
			
		}
		
		//sort by movie name		
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list,nameCompare);
		
		for(Movie movie:list){
			System.out.println(movie.getMovieName()+"  "+movie.getMovieRating()+"  "+movie.getMovieReleaseYear());
			
		}
		
		//sort by movie year
		
		Collections.sort(list);
		for(Movie movie:list){
			System.out.println(movie.getMovieReleaseYear()+"  "+movie.getMovieName()+"  "+movie.getMovieRating());
			
		}
		
		
		
		
	}

}
