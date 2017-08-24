package com.common;

public class Movie implements Comparable<Movie>{

	private double rating;
    private String name;
    private int year;
	
    //Constructor
    public Movie(String n,double r,int y){
    	this.name = n;
    	this.rating = r;
    	this.year = y;
    }
    
    
	@Override
	public int compareTo(Movie o) {
		return this.year - o.year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
}
