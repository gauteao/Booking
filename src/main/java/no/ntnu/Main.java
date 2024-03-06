package no.ntnu;

public class Main {
    public static void main(String[] args) {
        MovieTicketServer movieTicketServer = new MovieTicketServer("The Matrix", 10);

        // Creating four threads
        Thread client1 = new Thread(new MovieTicketClient("Alice", 3, movieTicketServer));
        Thread client2 = new Thread(new MovieTicketClient("Bob", 4, movieTicketServer));
        Thread client3 = new Thread(new MovieTicketClient("Charlie", 2, movieTicketServer));
        Thread client4 = new Thread(new MovieTicketClient("David", 3, movieTicketServer));

        // Starting the threads in order
        client1.start();
        client2.start();
        client3.start();
        client4.start();
    }
}