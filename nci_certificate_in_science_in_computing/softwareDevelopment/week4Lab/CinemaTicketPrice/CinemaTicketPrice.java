package nci_certificate_in_science_in_computing.softwareDevelopment.week4Lab.CinemaTicketPrice;

import java.util.Scanner;

public class CinemaTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the number of tickets needed: ");
        int numTickets = scanner.nextInt();

        double ticketPrice;
        if (age < 18) {
            ticketPrice = 10.0;
        } else {
            ticketPrice = 15.0;
        }

        double totalCost = numTickets * ticketPrice;

        System.out.println("Total cost for " + numTickets + " ticket(s): " + totalCost + " euros");

        scanner.close();
    }
}
