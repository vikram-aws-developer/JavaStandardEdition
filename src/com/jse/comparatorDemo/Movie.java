package com.jse.comparatorDemo;

public class Movie implements Comparable<Movie> {
	
	private int movieReleaseYear;
	private String movieName;
	private double movieRating;
	
	Movie(int mvYear,String mvName,double mvRating){
		this.movieReleaseYear=mvYear;
		this.movieName=mvName;
		this.movieRating=mvRating;
	}

	public int getMovieReleaseYear() {
		return movieReleaseYear;
	}

	public String getMovieName() {
		return movieName;
	}

	public double getMovieRating() {
		return movieRating;
	}

	@Override
	public int compareTo(Movie m) {
		return this.movieReleaseYear - m.movieReleaseYear;
	}
	
	
	
	

}
