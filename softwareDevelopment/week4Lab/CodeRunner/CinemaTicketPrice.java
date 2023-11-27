package softwareDevelopment.week4Lab.CodeRunner;

import java.util.Scanner;

public class CinemaTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the number of tickets needed: ");
        int numTickets = scanner.nextInt();

        Tickets tickets = new Tickets();

        tickets.setAge(age);
        tickets.setNumberOfTickets(numTickets);

        tickets.computePrice();

        double totalCost = tickets.getFinalPrice();

        System.out.println("Total cost for " + numTickets + " ticket(s): " + totalCost + " euros");

        scanner.close();
    }
}

class Tickets {
    private int age;
    private int numberOfTickets;
    private double finalPrice;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void computePrice() {
        if (age < 18) {
            finalPrice = numberOfTickets * 18.1;
        } else {
            finalPrice = numberOfTickets * 18.15;
        }
    }
}
