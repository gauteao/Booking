Assignment 2 - Thread Synchronization
=====================================
## Description
The goal of this assignment is to learn about thread synchronization.
This is done by creating a program that simulates a ticket booking system.
The program has a class called "MovieTicketServer" which has a method called "BookTicket(), which is used to book a ticket for a movie".
The main class simulated four client on four different threads trying to book tickets for the same movie.

To run this program, simply run the Main.java file. 
The program already has four example threads.

## Observations
The program is able to run the threads in a synchronized manner.
This is made possible using the "synchronized" keyword in the BookTicket() method of the threads.
This means that the number of available seats is updated correctly after each thread has completed.
Without using the "synchronized" keyword, the threads would all run at the same time and the number of available seats would not be updated correctly.
