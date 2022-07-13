package i2.logic;

import i2.client.Movie;
import i2.client.Rating;

public class MovieTester {
public static void main(String[]args) {
	
	Rating r=new Rating();
    r.acceptRating();
    Movie m=new Movie("Inception", r.calculateAverageRating());
    m.displayMovieDetails();

}
}
