package no.ntnu;
public class MovieTicketClient implements Runnable{
    private String customerName;
    private int numberOfSeats;
    private String movieName;
    private MovieTicketServer server;

    public MovieTicketClient(String customerName, int numberOfSeats, MovieTicketServer server) {
        this.customerName = customerName;
        this.numberOfSeats = numberOfSeats;
        this.server = server;
    }

    @Override
    public void run() {
        // call the BookTicket method with the required parameters
        server.BookTicket(customerName, numberOfSeats);
    }
}
