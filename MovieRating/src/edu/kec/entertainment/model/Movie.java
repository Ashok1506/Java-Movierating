package edu.kec.entertainment.model;

public class Movie {
	private int id;
	private String name;
	private Short releasedOn;
	private String genre;
	private Byte rating;
	
	public Movie() {}
	public Movie(int id, String name, Short releasedOn, String genre, Byte rating) {
		super();
		this.id = id;
		this.name = name;
		this.releasedOn = releasedOn;
		this.genre = genre;
		
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Short getReleasedOn() {
		return releasedOn;
	}
	public void setReleasedOn(Short releasedOn) {
		this.releasedOn = releasedOn;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Byte getRating() {
		return rating;
	}
	public void setRating(Byte rating) {
		this.rating = rating;
	}
	
}
