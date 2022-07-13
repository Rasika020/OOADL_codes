package i2.client;

public class Movie {
	 private String movieName;
	    private double imdbRating;
	    private Rating rating;

	    public Movie(String name, double imdbRating){
	    this.movieName=name;
	    this.imdbRating=imdbRating;
	    }
	    public void setMovieName(String movieName){
	    this.movieName=movieName;
	    }
	    public String getMovieName(){
	    return movieName;
	    }
	    public void setImdbRating() {
	    imdbRating=rating.calculateAverageRating();
	    }
	    public double getImdbRating(){
	    return imdbRating;
	    }
	    public void displayMovieDetails() {
	    System.out.println("Movie name is : "+getMovieName());
	    System.out.println("IMDB rating is: "+getImdbRating());

	    }

	
	}
	

