package softwareDevelopment.week5Lab.BloodApp;

import java.util.Scanner;

public class BloodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter your blood type:");
        String bloodType = scanner.nextLine().toUpperCase();

        // System.out.println("Enter your age:");
        int age = scanner.nextInt();

        Blood bloodInfo = new Blood(bloodType, age);
        bloodInfo.calculateDonationInfo();

        if (bloodInfo.getCanDonate()) {
            System.out.println("Can give blood to " + bloodInfo.getCanGiveTo());
        } else {
            System.out.println("Cannot donate");
        }
        System.out.println("Can receive blood from " + bloodInfo.getCanReceiveFrom());
    }
}

class Blood {
    private String bloodType;
    private int age;
    private boolean canDonate;
    private String canGiveTo;
    private String canReceiveFrom;

    public Blood(String bloodType, int age) {
        this.bloodType = bloodType;
        this.age = age;
    }

    public void calculateDonationInfo() {
        switch (bloodType) {
            case "AB":
                canGiveTo = "AB";
                canReceiveFrom = "AB, A, B, O";
                break;
            case "A":
                canGiveTo = "A and AB";
                canReceiveFrom = "A and O";
                break;
            case "B":
                canGiveTo = "B and AB";
                canReceiveFrom = "B and O";
                break;
            case "O":
                canGiveTo = "AB, A, B, O";
                canReceiveFrom = "O";
                break;
            default:
                canGiveTo = "Invalid blood type";
                canReceiveFrom = "Invalid blood type";
        }

        canDonate = age >= 18;
    }

    public boolean getCanDonate() {
        return canDonate;
    }

    public String getCanGiveTo() {
        return canGiveTo;
    }

    public String getCanReceiveFrom() {
        return canReceiveFrom;
    }
}
