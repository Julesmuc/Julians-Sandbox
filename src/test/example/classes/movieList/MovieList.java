package test.example.classes.movieList;

import java.util.Scanner;
import test.example.classes.movieList.model.Movies;
public class MovieList {
	private static Scanner in; 
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		String again = "";
		Movies favMovie;
		do {
			System.out.println("name");
			Movies.setName(in.next());
			System.out.println("rating");
			Movies.setRating(in.next());
			System.out.println("year");
			Movies.setYear(in.nextInt());
			System.out.println("runtime");
			Movies.setRuntime(in.nextInt());
			favMovie= new Movies(Movies.getName(), Movies.getRating(), Movies.getYear(), Movies.getRuntime());
			System.out.println(favMovie.toString());
			System.out.println("next movie??");
			again=in.next();
		} while (again.equalsIgnoreCase("y") || again.equalsIgnoreCase("yes"));

	}

}
