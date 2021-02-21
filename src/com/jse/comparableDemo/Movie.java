package com.jse.comparableDemo;

class Movie implements Comparable<Movie>
{
	private String movieName;
	private int movieReleasedYear;
	private double movieRating;
	
	//take parameterized constructor
	Movie(String movie,int year,double rating){
		this.movieName=movie;
		this.movieReleasedYear=year;
		this.movieRating=rating;
	}
	//generate getters
	public String getMovieName() {
		return movieName;
	}

	public int getMovieReleasedYear() {
		return movieReleasedYear;
	}

	public double getMovieRating() {
		return movieRating;
	}
	
	@Override
	public int compareTo(Movie m) {		
		return (int) (this.movieRating - m.movieRating);
		
	}
}