import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> movies = MoviesList.getMovies();

        boolean continueBooking = true;
        while (continueBooking) {

            System.out.println("Welcome to Movie Booking System");
            System.out.println("-------------------------------------------------------------------------------");
            System.out.printf("| %-3s | %-35s | %-10s | %-5s | %-10s |%n", "No.", "Movie Name", "Price(EGP)", "Seats", "Showtime");
            System.out.println("-------------------------------------------------------------------------------");

            for (int i = 0; i < movies.size(); i++) {
                Movie m = movies.get(i);
                System.out.printf("| %-3d | %-35s | %-10.2f | %-5d | %-10s |%n", 
                                i+1, m.movieName, m.ticketPrice, m.availableSeats, m.showTime);
            }
            System.out.println("-------------------------------------------------------------------------------");
            
            int choiceM = -1;
            while (true) {
                System.out.print("Choose a movie (1-" + movies.size() + "): ");
                if (sc.hasNextInt()) {
                    choiceM = sc.nextInt();
                    if (choiceM >= 1 && choiceM <= movies.size()) break;
                } else {
                    sc.next();
                }
                System.out.println("Invalid input! Please enter a number between 1 and " + movies.size() + "): ");
            }

            Movie selectedMovie = movies.get(choiceM - 1);
            selectedMovie.displayInfo();

            int tickets = 0;
            while (true) {
                System.out.print("Enter number of tickets: ");
                if (sc.hasNextInt()) {
                    tickets = sc.nextInt();
                    if (tickets > 0 && tickets <= selectedMovie.getAvailableSeats()) {
                        break; 
                    } else {
                        System.out.println("Error: Please enter a valid amount (1-" + selectedMovie.getAvailableSeats() + ").");
                    }
                } else {
                    System.out.println("Error: That's not a number!");
                    sc.next(); 
                }
            }
            

            Booking myBooking = new Booking(selectedMovie, tickets);
            System.out.println("Total Cost: " + myBooking.calculateTotal() + " EGP");

            selectedMovie.bookSeats(tickets);
            System.out.println("Seats remaining for " + selectedMovie.movieName + ": " + selectedMovie.getAvailableSeats());

            System.out.println("Do you want to book another movie? (Y/N): ");
            String response =sc.next();
            if (!response.equalsIgnoreCase("Y")){
                continueBooking = false;
                System.out.println("Thank you for using Movie Booking System!");
            }
        }
    }
}
