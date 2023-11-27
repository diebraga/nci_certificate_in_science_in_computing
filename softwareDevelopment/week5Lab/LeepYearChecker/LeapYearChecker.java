package softwareDevelopment.week5Lab.LeepYearChecker;

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false; // if not divisible of 4, so its not a leap year
        } else if (year % 100 != 0) {
            return true; // if divisible 4 but not by 100, so its a leap year
        } else if (year % 400 != 0) {
            return false; // if divisible by 100 but not 400, so its not a leap year
        } else {
            return true; // if is divisible of 400, so its a leap year
        }
    }
}
