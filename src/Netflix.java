
public class Netflix {
public static void main(String[] args) {
	Movie a = new Movie("Percy Jackson", 3);
	Movie b = new Movie("Harry Potter", 5);
	Movie c = new Movie("Infinity War", 4);
	Movie d = new Movie("Thor", 4);
	Movie e = new Movie("Mission Impossible", 2);
	NetflixQueue q = new NetflixQueue();
	a.getTicketPrice();
	q.addMovie(a);
	q.addMovie(b);
	q.addMovie(c);
	q.addMovie(d);
	q.addMovie(e);
	q.printMovies();
	q.getBestMovie();
	q.sortMoviesByRating();
	System.out.println("The greatest movie is" + q.getBestMovie());
	System.out.println("The second movie is" + q.getMovie(1));
}
}