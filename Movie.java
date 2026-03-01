public class Movie {
    String movieName;
    double ticketPrice;
    int availableSeats;
    String showTime;

    public Movie(String name, double price, int seats, String showTime) {
        this.movieName = name;
        this.ticketPrice = price;
        this.availableSeats = seats;
        this.showTime = showTime;
    }

    public void displayInfo() {
        System.out.println("Selected: " + movieName + " | Price: " + ticketPrice + " EGP | Available Seats: " + availableSeats + " | Showtime: " + showTime);
    }

    public String getInfo() {
        return movieName + " - " + ticketPrice + " EPG - Seats: " + availableSeats + " - Showtime: " + showTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
    
    public void bookSeats(int seats){
        this.availableSeats -= seats;
    }
}
