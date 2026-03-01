import java.util.ArrayList;

public class MoviesList {
    public static ArrayList<Movie> getMovies(){
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Avatar: Fire and Ash", 180, 50, "10:00 AM"));
        movies.add(new Movie("Avengers", 120, 40, "12:30 PM"));
        movies.add(new Movie("Batman", 100, 35, "2:00 PM"));
        movies.add(new Movie("The Housemaid", 100, 30, "3:30 PM"));
        movies.add(new Movie("Frozen", 80, 45, "5:00 PM"));
        movies.add(new Movie("The Lion King", 90, 50, "6:30 PM"));
        movies.add(new Movie("Spider-Man: No Way Home", 150, 40, "8:00 PM"));
        movies.add(new Movie("Inception", 110, 25, "9:30 PM"));
        movies.add(new Movie("The Matrix", 120, 20, "11:00 AM"));
        movies.add(new Movie("Joker", 130, 30, "1:30 PM"));
        movies.add(new Movie("Black Panther", 140, 35, "4:00 PM"));
        movies.add(new Movie("Toy Story 4", 85, 50, "6:00 PM"));
        movies.add(new Movie("Thor: Ragnarok", 125, 40, "7:30 PM"));
        movies.add(new Movie("Guardians of the Galaxy", 130, 35, "9:00 PM"));
        movies.add(new Movie("Coco", 90, 45, "10:30 AM"));
        movies.add(new Movie("Shrek", 80, 50, "12:00 PM"));
        movies.add(new Movie("Star Wars: The Rise of Skywalker", 160, 30, "2:30 PM"));
        movies.add(new Movie("Frozen II", 90, 45, "5:30 PM"));
        movies.add(new Movie("Wonder Woman", 120, 35, "8:00 PM"));
        movies.add(new Movie("The Dark Knight", 130, 40, "10:00 PM"));
        return movies;
    }
}
