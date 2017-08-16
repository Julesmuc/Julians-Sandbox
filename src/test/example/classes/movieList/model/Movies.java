package test.example.classes.movieList.model;

public class Movies {

	private static String name ; 
	private static String rating ; 
	private static int year ; 
	private static int runtime ;
	public Movies(String name, String rating, int year, int runtime) {
		
		Movies.setName(name);
		Movies.setRating(rating);
		Movies.setYear(year);
		Movies.setRuntime(runtime);
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Movies.name = name;
	}

	public static String getRating() {
		return rating;
	}

	public static void setRating(String rating) {
		Movies.rating = rating;
	}

	public static int getYear() {
		return year;
	}

	public static void setYear(int year) {
		Movies.year = year;
	}

	public static int getRuntime() {
		return runtime;
	}

	public static void setRuntime(int runtime) {
		Movies.runtime = runtime;
	}
	public String toString()
    {
        return "Movie title: " + name + 
                "\n Rating: " + rating + 
                "\n Year: " + year + 
                "\n Total runtime: " + runtime;
    }
}
