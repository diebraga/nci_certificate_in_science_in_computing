package softwareDevelopment.week11Lab.BikeApp;

import java.util.Scanner;

public class BikeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MountainBike myBike = new MountainBike("Hardtail");
        System.out.println("Initial Bike Settings:");
        System.out.println("Current Speed: " + myBike.getSpeed());
        System.out.println("Suspension Type: " + myBike.getSuspensionType());

        // Input for increasing speed
        System.out.print("Enter speed increase: ");
        int speedIncrease = scanner.nextInt();
        myBike.increaseSpeed(speedIncrease);
        System.out.println("Speed after increase: " + myBike.getSpeed());

        // Input for changing suspension type
        scanner.nextLine();
        System.out.print("Enter new suspension type: ");
        String newSuspensionType = scanner.nextLine();
        myBike.setSuspensionType(newSuspensionType);
        System.out.println("New Suspension Type: " + myBike.getSuspensionType());

        // Input for additional speed increase
        System.out.print("Enter additional speed increase: ");
        speedIncrease = scanner.nextInt();
        myBike.increaseSpeed(speedIncrease);
        System.out.println("Final Speed: " + myBike.getSpeed());

        scanner.close();
    }
}
