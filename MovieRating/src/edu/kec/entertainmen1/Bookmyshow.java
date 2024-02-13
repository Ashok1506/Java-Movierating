package edu.kec.entertainmen1;
import java.util.LinkedList;
import edu.kec.entertainment.iservice.IMovieService;
import edu.kec.entertainment.model.Movie;
import edu.kec.entertainment.service.MovieService;
import java.util.Scanner;
public class Bookmyshow {

	public static void main(String[] args) {
		System.out.println("Enter 1 to insert Movie.");
		System.out.println("Enter 2 to show the collection");
		System.out.println("Enter 3 to find the movie by Id");
		Scanner scanner=new Scanner(System.in);
		Integer check=scanner.nextInt(); 
		scanner.nextLine();
		IMovieService movieService = new MovieService();
		switch(check) {
		case 1:{
			System.out.println("Enter the Movie Name");
			String name=scanner.nextLine();
			System.out.println("Enter the Movie Released date");
			short releasedDate=scanner.nextShort();
			scanner.nextLine();
			System.out.println("Enter the Movie Genre");
			String genre=scanner.nextLine();
			System.out.println("Enter the Movie Ratings");
			byte ratings=scanner.nextByte();
		Movie movie = new Movie(0,name,releasedDate,genre,ratings);
		if(movieService.add(movie)) {
			System.out.println("Movied added.");
		}else {
			System.out.println("Server is busy. Please try again later.");
		}
		break;
		}
		case 2:{
		LinkedList<Movie> movielist=movieService.getAllmovies();
		for(Movie movies:movielist) {
			System.out.println(movies.getId()+"\t"+movies.getName()+"\t"+movies.getReleasedOn());
			
		}
		break;
		}
		case 3:{
		System.out.println("Enter the Movie Id");
		Movie movieq=movieService.getById(scanner.nextInt());
		System.out.println(movieq.getName()+"\t"+movieq.getReleasedOn()+"\t"+movieq.getRating()+"\t"+movieq.getGenre());
		}
		}
	}
	}
