package edu.kec.entertainment.iservice;
import edu.kec.entertainment.model.*;
import java.util.LinkedList;
public interface IMovieService {
	public boolean add(Movie movie);
	public LinkedList<Movie> getAllmovies();
	public Movie getById(Integer id);
}
