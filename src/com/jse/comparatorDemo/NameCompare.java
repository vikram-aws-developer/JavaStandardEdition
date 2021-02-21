package com.jse.comparatorDemo;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie>{

	@Override
	public int compare(Movie movie1, Movie movie2) {
		
		return movie1.getMovieName().compareTo(movie2.getMovieName());
	}

}
