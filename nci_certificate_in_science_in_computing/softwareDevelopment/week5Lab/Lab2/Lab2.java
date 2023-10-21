package softwareDevelopment.week5Lab.Lab2;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name:");
            String name = scanner.nextLine();

            System.out.println("Enter the number of nights:");
            int nights = scanner.nextInt();

            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            HotelRoom room = new HotelRoom(name, nights, age);

            if (room.canBook()) {
                int totalCost = room.calculateTotalCost();
                System.out.println("Booking Details:\n" + room);
                System.out.println("Total Cost: " + totalCost + " euro");
                System.out.println("Booking confirmed!");
            } else {
                System.out.println("Sorry, you must be at least 18 to book a room.");
            }
        }
    }
}
