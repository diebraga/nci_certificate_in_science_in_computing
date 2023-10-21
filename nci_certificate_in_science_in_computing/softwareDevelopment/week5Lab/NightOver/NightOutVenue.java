package softwareDevelopment.week5Lab.NighOver;

import java.util.Scanner;

public class NightOutVenue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter your programme code:");
        String programmeCode = scanner.nextLine().toUpperCase(); // Convert to uppercase to handle both cases

        // System.out.println("Enter your year of study:");
        int year = scanner.nextInt();

        String venue = getVenue(programmeCode, year);

        System.out.println(venue);
    }

    public static String getVenue(String programmeCode, int year) {
        switch (year) {
            case 1:
                switch (programmeCode) {
                    case "HDAIML":
                        return "Lagoona";
                    case "HDBC":
                        return "Harbourmaster";
                    default:
                        return "Invalid Programme Code";
                }
            case 2:
                switch (programmeCode) {
                    case "HDAIML":
                        return "Harbourmaster";
                    case "HDBC":
                        return "Lagoona";
                    default:
                        return "Invalid Programme Code";
                }
            default:
                return "Invalid Year";
        }
    }
}
