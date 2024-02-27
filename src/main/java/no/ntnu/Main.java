package no.ntnu;

import no.ntnu.MovieTicketClient;
import no.ntnu.MovieTicketServer;
public class Main {
    public static void main(String[] args) {
        MovieTicketServer movieTicketServer = new MovieTicketServer("The Matrix", 10);

        // Creating four threads
        Thread client1 = new Thread(new MovieTicketClient("Alice", 3, movieTicketServer));
        Thread client2 = new Thread(new MovieTicketClient("Bob", 4, movieTicketServer));
        Thread client3 = new Thread(new MovieTicketClient("Charlie", 2, movieTicketServer));
        Thread client4 = new Thread(new MovieTicketClient("David", 3, movieTicketServer));

        // Starting the threads in order
        try {
            client1.start();
            client1.join(); // Wait for client1 to finish

            client2.start();
            client2.join(); // Wait for client2 to finish

            client3.start();
            client3.join(); // Wait for client3 to finish

            client4.start();
            client4.join(); // Wait for client4 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}