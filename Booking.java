public class Booking {
    Movie movie;
    int numberOfTickets;

    public Booking(Movie movie, int tickets){
        this.movie = movie;
        this.numberOfTickets = tickets;
    }
    
    public double calculateTotal() {
        double total = numberOfTickets * movie.ticketPrice;

        if (numberOfTickets >= 5) {
            System.out.println("Congratulations! 10% discount applied for booking 5 or more tickets.");
            return total * 0.90; // Apply 10% discount
        }
        return total;
    }
}
